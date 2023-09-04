SUMMARY = "ZSH Completion for wezterm"
DESCRIPTION = "Zsh completion script for wezterm."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | BSL-1.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | BSD-2-Clause) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-2-Clause & BSD-3-Clause & CC0-1.0 & ISC & LGPL-2.1-only & MIT & MPL-2.0 & WTFPL & Zlib & MIT"

PV = "20230712.072601.f4abf8fd"

RPM_NAME = "wezterm-zsh-completion-20230712.072601.f4abf8fd-3.1.noarch.rpm"
RPM_HASH = "2b761673b47c82b0e4ea1da8182188a7a6e2f171b6e01341042388ab88333b1084535e6913c2309d0959073218ca3193fa1c5c3777c5ac7a3450a7341d993b79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wezterm-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
