SUMMARY = "A identity management service and clients."
DESCRIPTION = "An identity management platform written in rust that supports RADIUS, SSH Key management \
and more."
LICENSE = "( Apache-2.0 | BSL-1.0 ) & ( Apache-2.0 | ISC | MIT ) & ( Apache-2.0 | MIT ) & ( Apache-2.0-with-LLVM-exception | Apache-2.0 | MIT ) & ( CC0-1.0 | Apache-2.0 ) & ( MIT | Apache-2.0 | Zlib ) & ( Unlicense | MIT ) & ( Zlib | Apache-2.0 | MIT ) & Apache-2.0 & BSD-2-Clause & BSD-3-Clause & CC0-1.0 & ISC & MIT & MPL-2.0 & MPL-2.0+"

PV = "1.1.0~alpha12~git0.bcdbb18"

RPM_NAME = "kanidm-1.1.0~alpha12~git0.bcdbb18-1.2.aarch64.rpm"
RPM_HASH = "fc51a7f87e48bf5040a38c5464d48e493ca0a48f9f92860184435571e8ff1f8fe2e416866883989e5657ba5c27b7a3fa4e81a5e5f4a8050c49689b4bc389d17a"

RPROVIDES:${PN} += "kanidm"

RDEPENDS:${PN} += "kanidm-clients \
kanidm-unixd-clients"

inherit rpm
