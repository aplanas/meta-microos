SUMMARY = "ZSH Completion for wezterm"
DESCRIPTION = "Zsh completion script for wezterm."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | BSL-1.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | BSD-2-Clause) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-2-Clause & BSD-3-Clause & CC0-1.0 & ISC & LGPL-2.1-only & MIT & MPL-2.0 & WTFPL & Zlib & MIT"

PV = "20230408.112425.69ae8472"

RPM_NAME = "wezterm-zsh-completion-20230408.112425.69ae8472-1.1.noarch.rpm"
RPM_HASH = "ec6d9f2eb21a9a69038dbbb8f50fadc12bc094309241a3c0ec936cebbe1053d1534e378081cffaf6dc4bd6355ad94665cbcb8eb1ba3a752085dc20f0fcde076b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wezterm-zsh-completion"
RDEPENDS:${PN} += ""

inherit rpm
