SUMMARY = "Examples of EFL usage"
DESCRIPTION = "Examples usage of the EFL library."
LICENSE = "BSD-2-Clause & LGPL-2.1-only & Zlib"

PV = "1.26.3"

RPM_NAME = "efl-examples-1.26.3-30.6.aarch64.rpm"
RPM_HASH = "73f114ce662495c35a30852001382f7caceffe26669a1ce06848c638aeacc701bb0998cf8a20c9d9c914af2a0013d1265495629afe0a17d38fb8454d499cf0d1"

RPROVIDES:${PN} += "efl-examples \
efl-examples(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
