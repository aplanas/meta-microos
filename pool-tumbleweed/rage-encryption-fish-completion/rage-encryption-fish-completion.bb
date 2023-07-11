SUMMARY = "Fish Completion for rage-encryption"
DESCRIPTION = "Fish command-line completion support for rage-encryption."
LICENSE = "(0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-3-Clause & CDDL-1.0 & MIT"

PV = "0.9.2+0"

RPM_NAME = "rage-encryption-fish-completion-0.9.2+0-1.1.noarch.rpm"
RPM_HASH = "6c49fc55ca8cd2d8a779353cd13cdb4183947932abc19ff47fb5c87abddb1d01ec0a8c50b4bbb097036fd6abdc956ec1d9db61dd22351b226672fb3426ff9f01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rage-encryption-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
