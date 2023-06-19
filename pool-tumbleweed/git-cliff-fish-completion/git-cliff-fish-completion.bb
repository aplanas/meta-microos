SUMMARY = "Fish Completion for git-cliff"
DESCRIPTION = "Fish command-line completion support for git-cliff."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | ISC | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-3-Clause & ISC & MIT & MPL-2.0 & GPL-3.0-only"

PV = "1.2.0"

RPM_NAME = "git-cliff-fish-completion-1.2.0-1.1.noarch.rpm"
RPM_HASH = "d4d7e27693fe6f826e44a32e0a937049e846c1841195779d57c10fd03591e2a51c4c216f600943779807d16db3857dc8f042b08bf181fcd9b9e91b93a85fa30c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-cliff-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
