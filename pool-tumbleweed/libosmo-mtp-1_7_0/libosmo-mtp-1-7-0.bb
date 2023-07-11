SUMMARY = "Osmocom Message Transfer Part library"
DESCRIPTION = "The Message Transfer Part (MTP) is part of the Signaling System 7 \
(SS7) used for communication in Public Switched Telephone Networks. \
MTP is responsible for reliable, unduplicated and in-sequence \
transport of SS7 messages between communication partners."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "libosmo-mtp-1_7_0-1.7.0-1.2.aarch64.rpm"
RPM_HASH = "1ecf3286e35a5a5509bc1c3e0116ce7c6d074660552c9cf505bddad0b3785c5b8a385caeedc5e9c8cc52cc1a0f196728245b087179584055c2247874c59b29d1"

RPROVIDES:${PN} += "libosmo-mtp-1-7-0 \
libosmo-mtp-1.7.0.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
