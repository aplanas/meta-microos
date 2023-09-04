SUMMARY = "A identity management service and clients."
DESCRIPTION = "An identity management platform written in rust that supports RADIUS, SSH Key management \
and more."
LICENSE = "( Apache-2.0 | BSL-1.0 ) & ( Apache-2.0 | ISC | MIT ) & ( Apache-2.0 | MIT ) & ( Apache-2.0-with-LLVM-exception | Apache-2.0 | MIT ) & ( CC0-1.0 | Apache-2.0 ) & ( MIT | Apache-2.0 | Zlib ) & ( Unlicense | MIT ) & ( Zlib | Apache-2.0 | MIT ) & Apache-2.0 & BSD-2-Clause & BSD-3-Clause & CC0-1.0 & ISC & MIT & MPL-2.0 & MPL-2.0+"

PV = "1.1.0~beta13~git7.1fb34a9"

RPM_NAME = "kanidm-1.1.0~beta13~git7.1fb34a9-1.1.aarch64.rpm"
RPM_HASH = "82a56254cfb5d5c4ed7151035167277158f9f7069589d0deda299a907bc76eb58dfd897a52ce589f1cafd4c5c0e88b7f86db55c27a406ebca17e12f41c6dc932"

RPROVIDES:${PN} += "kanidm"

RDEPENDS:${PN} += "kanidm-clients \
kanidm-unixd-clients"

inherit rpm
