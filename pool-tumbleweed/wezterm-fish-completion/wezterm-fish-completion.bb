SUMMARY = "Fish Completion for wezterm"
DESCRIPTION = "Fish completion script for wezterm."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | BSL-1.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | BSD-2-Clause) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-2-Clause & BSD-3-Clause & CC0-1.0 & ISC & LGPL-2.1-only & MIT & MPL-2.0 & WTFPL & Zlib & MIT"

PV = "20230712.072601.f4abf8fd"

RPM_NAME = "wezterm-fish-completion-20230712.072601.f4abf8fd-4.1.noarch.rpm"
RPM_HASH = "1686e9ca750bec0b13230ba58dc6ddbce9f5439dcb90b287386fb75d5daf1a7b511abefc079c20071c57b6b0cbe32254d257e2c098cca1e45cbebfa912820071"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wezterm-fish-completion"

RDEPENDS:${PN} += ""

inherit rpm
