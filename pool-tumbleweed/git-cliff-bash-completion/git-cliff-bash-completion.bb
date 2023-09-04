SUMMARY = "Bash Completion for git-cliff"
DESCRIPTION = "Bash command-line completion support for git-cliff."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | ISC | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-3-Clause & ISC & MIT & MPL-2.0 & GPL-3.0-only"

PV = "1.2.0"

RPM_NAME = "git-cliff-bash-completion-1.2.0-2.1.noarch.rpm"
RPM_HASH = "9a49bc46a3fe7225892cbb3b8da8a63a542a01df6fa936c39b4f3c47466bf8f5758f8d63bd34f69a153a05a7222f7b878d7450c4291e7011b65c04659a8ea5d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-cliff-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
