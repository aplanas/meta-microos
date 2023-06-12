SUMMARY = "Bash Completion for git-cliff"
DESCRIPTION = "Bash command-line completion support for git-cliff."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | ISC | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-WITH-LLVM-exception | MIT) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-3-Clause & ISC & MIT & MPL-2.0 & GPL-3.0-only"

PV = "1.2.0"

RPM_NAME = "git-cliff-bash-completion-1.2.0-1.1.noarch.rpm"
RPM_HASH = "b64e9af99a2aab9e8a3bc9226376e7a75e2af17e5630e033267edd40301688dc638b821978dfe8e934b567e4e1fa4daea4135dbbec3e8260cc84676925169779"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-cliff-bash-completion"
RDEPENDS:${PN} += "bash-completion"

inherit rpm
