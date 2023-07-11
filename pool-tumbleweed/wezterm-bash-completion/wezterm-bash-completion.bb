SUMMARY = "Bash Completion for wezterm"
DESCRIPTION = "Bash completion support for wezterm."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | BSL-1.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | BSD-2-Clause) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-2-Clause & BSD-3-Clause & CC0-1.0 & ISC & LGPL-2.1-only & MIT & MPL-2.0 & WTFPL & Zlib & MIT"

PV = "20230408.112425.69ae8472"

RPM_NAME = "wezterm-bash-completion-20230408.112425.69ae8472-2.1.noarch.rpm"
RPM_HASH = "450f96eeb6cccc9507bd75ee1726cd985f2f22834ccd0d407f63678ca03ba019d2dcb298b2a830db9e90c9ba07c46088483fbf2c26b5f602d90819a0a313ebc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wezterm-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
