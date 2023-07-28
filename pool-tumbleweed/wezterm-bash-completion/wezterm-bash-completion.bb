SUMMARY = "Bash Completion for wezterm"
DESCRIPTION = "Bash completion support for wezterm."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | BSL-1.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | BSD-2-Clause) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-2-Clause & BSD-3-Clause & CC0-1.0 & ISC & LGPL-2.1-only & MIT & MPL-2.0 & WTFPL & Zlib & MIT"

PV = "20230712.072601.f4abf8fd"

RPM_NAME = "wezterm-bash-completion-20230712.072601.f4abf8fd-1.1.noarch.rpm"
RPM_HASH = "94abd6e72ef548a3230b8db39e1ff9d68fc77c622f1a6972d133142603b8034e05b480543a126eeb9944b8f0f0f607f2501b134c102a907f8dd6254d2637baa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wezterm-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
