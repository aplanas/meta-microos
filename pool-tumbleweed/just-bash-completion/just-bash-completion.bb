SUMMARY = "Bash Completion for just"
DESCRIPTION = "Bash command-line completion support for just."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (MIT | Unlicense) & Apache-2.0 & BSD-3-Clause & CC0-1.0 & MIT & CC0-1.0"

PV = "1.14.0"

RPM_NAME = "just-bash-completion-1.14.0-1.2.noarch.rpm"
RPM_HASH = "02c50fb1bdcb8bf88bf922124bb5589b38ad6f16263ad014adf0e1f3f0d1de7186f75812fbdf9e5155eacb2b1c04e235994df2ec9da66846216fa36c87c7fb92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "just-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
