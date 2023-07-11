SUMMARY = "Fish Completion for wezterm"
DESCRIPTION = "Fish completion script for wezterm."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | BSL-1.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | BSD-2-Clause) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-2-Clause & BSD-3-Clause & CC0-1.0 & ISC & LGPL-2.1-only & MIT & MPL-2.0 & WTFPL & Zlib & MIT"

PV = "20230408.112425.69ae8472"

RPM_NAME = "wezterm-fish-completion-20230408.112425.69ae8472-2.1.noarch.rpm"
RPM_HASH = "2e84bf432593b663ee122faadf1f52faf76a3c30e22fea29d2b1ea304493ac7f85fbe7800dce80d8e80c0850e1e9779271f75b46dd1d238d70ad81431bb85df8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wezterm-fish-completion"

RDEPENDS:${PN} += ""

inherit rpm
