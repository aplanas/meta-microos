SUMMARY = "Bash Completion for wezterm"
DESCRIPTION = "Bash completion support for wezterm."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | BSL-1.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | BSD-2-Clause) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-2-Clause & BSD-3-Clause & CC0-1.0 & ISC & LGPL-2.1-only & MIT & MPL-2.0 & WTFPL & Zlib & MIT"

PV = "20230712.072601.f4abf8fd"

RPM_NAME = "wezterm-bash-completion-20230712.072601.f4abf8fd-3.1.noarch.rpm"
RPM_HASH = "ffc4caad4db68e0a610cfd0527224cc5249163e98461282827aadd9a76480c34b0cb3587b24df335eb52e4ca71aa64056c5e789116b5e7042b1aad04cb49af70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wezterm-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
