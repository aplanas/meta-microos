SUMMARY = "Bash Completion for wezterm"
DESCRIPTION = "Bash completion support for wezterm."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | BSL-1.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | BSD-2-Clause) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-2-Clause & BSD-3-Clause & CC0-1.0 & ISC & LGPL-2.1-only & MIT & MPL-2.0 & WTFPL & Zlib & MIT"

PV = "20230408.112425.69ae8472"

RPM_NAME = "wezterm-bash-completion-20230408.112425.69ae8472-1.1.noarch.rpm"
RPM_HASH = "e09c776e2ea28d66214c278561d0b427440209471da33a1213d606d019f53d6cc11eef3bdb398e3a96ba1b1cd8516fa3b2e4738c7421e60b668a4b3d891bf6b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wezterm-bash-completion"
RDEPENDS:${PN} += "bash-completion"

inherit rpm
