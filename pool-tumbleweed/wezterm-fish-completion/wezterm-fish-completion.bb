SUMMARY = "Fish Completion for wezterm"
DESCRIPTION = "Fish completion script for wezterm."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | BSL-1.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | BSD-2-Clause) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-2-Clause & BSD-3-Clause & CC0-1.0 & ISC & LGPL-2.1-only & MIT & MPL-2.0 & WTFPL & Zlib & MIT"

PV = "20230712.072601.f4abf8fd"

RPM_NAME = "wezterm-fish-completion-20230712.072601.f4abf8fd-1.1.noarch.rpm"
RPM_HASH = "50d36f4c3ce0a3b92deaedd11edfbacec788a6c812d613702dea2ea9bd8ee6396a7adb463c630be11fd80a6e9625f0ec9b4f4fdba21f8377c7d28d1af9b66b6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wezterm-fish-completion"

RDEPENDS:${PN} += ""

inherit rpm
