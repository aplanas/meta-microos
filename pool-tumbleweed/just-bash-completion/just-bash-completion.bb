SUMMARY = "Bash Completion for just"
DESCRIPTION = "Bash command-line completion support for just."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-WITH-LLVM-exception | MIT) & (MIT | Unlicense) & Apache-2.0 & BSD-3-Clause & CC0-1.0 & MIT & CC0-1.0"

PV = "1.14.0"

RPM_NAME = "just-bash-completion-1.14.0-1.1.noarch.rpm"
RPM_HASH = "862b3e2386d8f26ec5d3fe499a9e31a9c596e74c09c4e415d452755249294a35dc7b8cf8dde5f3e14cf7f37aa9798a7aa992af2785e83001d72a1dd45538818a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "just-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
