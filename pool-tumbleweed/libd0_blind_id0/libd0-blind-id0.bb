SUMMARY = "Library for identification using RSA Blind Signatures"
DESCRIPTION = "A library for user identification using RSA blind signatures."
LICENSE = "BSD-3-Clause"

PV = "0.8.5"

RPM_NAME = "libd0_blind_id0-0.8.5-1.1.aarch64.rpm"
RPM_HASH = "255a7e019e5f58c16e7129105913d4dfd57421111d77e1f112523cdce36a1a27fb8de80c7c20585e737564effbc3c7b385cb513b474d3ea4a98968f429c78632"

RPROVIDES:${PN} += "libd0-blind-id.so.0 \
libd0-blind-id0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10"

inherit rpm
