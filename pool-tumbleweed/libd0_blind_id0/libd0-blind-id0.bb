SUMMARY = "Library for identification using RSA Blind Signatures"
DESCRIPTION = "A library for user identification using RSA blind signatures."
LICENSE = "BSD-3-Clause"

PV = "0.8.6"

RPM_NAME = "libd0_blind_id0-0.8.6-1.1.aarch64.rpm"
RPM_HASH = "22ed81a962be594ea53c75e74b413a7766d6f0925a30dab9ac65df44e352b10997e3a9b6e5d60729d848135daebc6db107c5313e6fc40544949aa406895da215"

RPROVIDES:${PN} += "libd0-blind-id.so.0 \
libd0-blind-id0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10"

inherit rpm
