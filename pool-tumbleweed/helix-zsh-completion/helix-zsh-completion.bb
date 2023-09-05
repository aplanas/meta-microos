SUMMARY = "Zsh Completion for helix"
DESCRIPTION = "Zsh command-line completion support for helix."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (MIT | Apache-2.0 | Zlib) & (MIT | Unlicense) & (Zlib | Apache-2.0 | MIT) & Apache-2.0 & BSL-1.0 & ISC & MIT & MPL-2.0 & Zlib & MPL-2.0"

PV = "23.05"

RPM_NAME = "helix-zsh-completion-23.05-3.1.noarch.rpm"
RPM_HASH = "7622823fb6b5cb6579df42d737ca59de7bd4150d65a4f5f98d4fadbffc8aa6c131a709a3f0f21c1d869ff793d0652cdf21bcd9646a74d4f118ef020dd0fe9d26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "helix-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
