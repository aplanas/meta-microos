SUMMARY = "ZSH Completion for wezterm"
DESCRIPTION = "Zsh completion script for wezterm."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | BSL-1.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | BSD-2-Clause) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-2-Clause & BSD-3-Clause & CC0-1.0 & ISC & LGPL-2.1-only & MIT & MPL-2.0 & WTFPL & Zlib & MIT"

PV = "20230712.072601.f4abf8fd"

RPM_NAME = "wezterm-zsh-completion-20230712.072601.f4abf8fd-4.1.noarch.rpm"
RPM_HASH = "a141c7ae4c5c74a9eec7792ed7d24fa29d0c06cbe650b425c4e2d5e830be307a7e048d972a52a81b46b9dc3e64ebc6366c316a956ca0f3184bdca8f5fd6a5d08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wezterm-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
