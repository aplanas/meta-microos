SUMMARY = "Fish Completion for wezterm"
DESCRIPTION = "Fish completion script for wezterm."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | BSL-1.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | BSD-2-Clause) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-2-Clause & BSD-3-Clause & CC0-1.0 & ISC & LGPL-2.1-only & MIT & MPL-2.0 & WTFPL & Zlib & MIT"

PV = "20230712.072601.f4abf8fd"

RPM_NAME = "wezterm-fish-completion-20230712.072601.f4abf8fd-3.1.noarch.rpm"
RPM_HASH = "4639eaef66153d35172fc616a3f10d56a3781aa61ba7bc0a50fcf516393f0724589458da1f5e30bd5ed4089e9c6e66e3c066e8a07816bb5712834a18a6f35831"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wezterm-fish-completion"

RDEPENDS:${PN} += ""

inherit rpm
