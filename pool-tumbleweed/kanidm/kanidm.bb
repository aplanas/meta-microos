SUMMARY = "A identity management service and clients."
DESCRIPTION = "An identity management platform written in rust that supports RADIUS, SSH Key management \
and more."
LICENSE = "( Apache-2.0 | BSL-1.0 ) & ( Apache-2.0 | ISC | MIT ) & ( Apache-2.0 | MIT ) & ( Apache-2.0-with-LLVM-exception | Apache-2.0 | MIT ) & ( CC0-1.0 | Apache-2.0 ) & ( MIT | Apache-2.0 | Zlib ) & ( Unlicense | MIT ) & ( Zlib | Apache-2.0 | MIT ) & Apache-2.0 & BSD-2-Clause & BSD-3-Clause & CC0-1.0 & ISC & MIT & MPL-2.0 & MPL-2.0+"

PV = "1.1.0~beta13~git2.5d1e2f9"

RPM_NAME = "kanidm-1.1.0~beta13~git2.5d1e2f9-1.1.aarch64.rpm"
RPM_HASH = "b948e2504e9a81b7c9667a8a9a3a1373f3280783279b4f3287f302fe16d337b93da153d799f717117881e24108d6b0cc08c52633714469fc1de1ff18254e092d"

RPROVIDES:${PN} += "kanidm"

RDEPENDS:${PN} += "kanidm-clients \
kanidm-unixd-clients"

inherit rpm
