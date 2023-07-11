SUMMARY = "ZSH Completion for wezterm"
DESCRIPTION = "Zsh completion script for wezterm."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | BSL-1.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | BSD-2-Clause) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-2-Clause & BSD-3-Clause & CC0-1.0 & ISC & LGPL-2.1-only & MIT & MPL-2.0 & WTFPL & Zlib & MIT"

PV = "20230408.112425.69ae8472"

RPM_NAME = "wezterm-zsh-completion-20230408.112425.69ae8472-2.1.noarch.rpm"
RPM_HASH = "1013662677711fa02cfc02e7aebe759ca0c78c8b072d397edd10a5075735a05be9568179c85d2bfdf793735ebb3b67249cf1ba9654b999d01435eec62823354f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wezterm-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
