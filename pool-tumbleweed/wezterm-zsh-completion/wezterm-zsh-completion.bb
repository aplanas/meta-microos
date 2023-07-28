SUMMARY = "ZSH Completion for wezterm"
DESCRIPTION = "Zsh completion script for wezterm."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | BSL-1.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | BSD-2-Clause) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-2-Clause & BSD-3-Clause & CC0-1.0 & ISC & LGPL-2.1-only & MIT & MPL-2.0 & WTFPL & Zlib & MIT"

PV = "20230712.072601.f4abf8fd"

RPM_NAME = "wezterm-zsh-completion-20230712.072601.f4abf8fd-1.1.noarch.rpm"
RPM_HASH = "82b3991ae96fb3c3350025669065487fa96b612dd6e34f65bfb9ec04b34536cf8a903b2d03d6521e6abebbffef7cbf57daa5d493f37e09a90c5f5fa3615706ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wezterm-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
