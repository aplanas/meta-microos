SUMMARY = "Bash Completion for helix"
DESCRIPTION = "Bash command-line completion support for helix."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (MIT | Apache-2.0 | Zlib) & (MIT | Unlicense) & (Zlib | Apache-2.0 | MIT) & Apache-2.0 & BSL-1.0 & ISC & MIT & MPL-2.0 & Zlib & MPL-2.0"

PV = "23.05"

RPM_NAME = "helix-bash-completion-23.05-3.1.noarch.rpm"
RPM_HASH = "33ba574f61dc650192af48d557cfbe8f64d32b8dcb01c246ecb1f2a229db38b06db96fd1e026f81961d9b6f291463987843d0ab91669337d15b8aeb3c1d8906b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "helix-bash-completion"

RDEPENDS:${PN} += ""

inherit rpm
