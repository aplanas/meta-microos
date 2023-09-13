SUMMARY = "Bash Completion for wezterm"
DESCRIPTION = "Bash completion support for wezterm."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | BSL-1.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | BSD-2-Clause) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-2-Clause & BSD-3-Clause & CC0-1.0 & ISC & LGPL-2.1-only & MIT & MPL-2.0 & WTFPL & Zlib & MIT"

PV = "20230712.072601.f4abf8fd"

RPM_NAME = "wezterm-bash-completion-20230712.072601.f4abf8fd-4.1.noarch.rpm"
RPM_HASH = "5add2f3b6ef1ee89f816b4eb4b70dcc4ab924da1d172cc970db6d6e1a2534c84c9eb285af81646fea24d317669d43af9de877bccd81e63da398f7ba3d8204cb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wezterm-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
