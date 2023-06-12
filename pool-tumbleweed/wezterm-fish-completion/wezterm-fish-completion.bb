SUMMARY = "Fish Completion for wezterm"
DESCRIPTION = "Fish completion script for wezterm."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | BSL-1.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | BSD-2-Clause) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-2-Clause & BSD-3-Clause & CC0-1.0 & ISC & LGPL-2.1-only & MIT & MPL-2.0 & WTFPL & Zlib & MIT"

PV = "20230408.112425.69ae8472"

RPM_NAME = "wezterm-fish-completion-20230408.112425.69ae8472-1.1.noarch.rpm"
RPM_HASH = "9c9f1837e1b7de354f484391e0c35267ce8d742144aa290074fe15dba2fb17924f07a04f8f175e6540c4cbecd1f131bdabe6305ff9292323168df895bae3ac9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wezterm-fish-completion"
RDEPENDS:${PN} += ""

inherit rpm
