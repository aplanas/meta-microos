SUMMARY = "Bash Completion for helix"
DESCRIPTION = "Bash command-line completion support for helix."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (MIT | Apache-2.0 | Zlib) & (MIT | Unlicense) & (Zlib | Apache-2.0 | MIT) & Apache-2.0 & BSL-1.0 & ISC & MIT & MPL-2.0 & Zlib & MPL-2.0"

PV = "23.05"

RPM_NAME = "helix-bash-completion-23.05-2.1.noarch.rpm"
RPM_HASH = "f305418d289a1d8e1af120e75ceeff1600c21ae51ab48f10adf2fe0df12f8186e4853478d1e858b4faa9838ef8d12e6b7256ff2ed1a8285b5c783fe07966d2e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "helix-bash-completion"

RDEPENDS:${PN} += ""

inherit rpm
