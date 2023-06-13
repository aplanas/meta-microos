SUMMARY = "Fish Completion for rage-encryption"
DESCRIPTION = "Fish command-line completion support for rage-encryption."
LICENSE = "(0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-3-Clause & CDDL-1.0 & MIT"

PV = "0.9.1+0"

RPM_NAME = "rage-encryption-fish-completion-0.9.1+0-2.1.noarch.rpm"
RPM_HASH = "f84cf0a00585e3df7393ad2f7f5e56123444acd6f51a324d4897379192e2cd8d583edaeb5b936d9797b44e12e0bfa4c804b1fe9c894405595eb8caa978190685"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rage-encryption-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
