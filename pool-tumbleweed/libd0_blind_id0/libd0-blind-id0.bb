SUMMARY = "Library for identification using RSA Blind Signatures"
DESCRIPTION = "A library for user identification using RSA blind signatures."
LICENSE = "BSD-3-Clause"

PV = "0.8.5"

RPM_NAME = "libd0_blind_id0-0.8.5-1.1.aarch64.rpm"
RPM_HASH = "255a7e019e5f58c16e7129105913d4dfd57421111d77e1f112523cdce36a1a27fb8de80c7c20585e737564effbc3c7b385cb513b474d3ea4a98968f429c78632"

RPROVIDES:${PN} += "libd0_blind_id.so.0()(64bit) \
libd0_blind_id0 \
libd0_blind_id0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.25)(64bit) \
libgmp.so.10()(64bit)"

inherit rpm
