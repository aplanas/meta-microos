SUMMARY = "Osmocom Message Transfer Part library"
DESCRIPTION = "The Message Transfer Part (MTP) is part of the Signaling System 7 \
(SS7) used for communication in Public Switched Telephone Networks. \
MTP is responsible for reliable, unduplicated and in-sequence \
transport of SS7 messages between communication partners."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "libosmo-mtp-1_7_0-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "af004efe8a3f04542ba024e8d388c195ea8f275b0d75e2f624c2f07b67bf14d405fa1877ee1135cacaee9be5940f0b19655fd442916d5c31de8b6295a31343ef"

RPROVIDES:${PN} += "libosmo-mtp-1.7.0.so()(64bit) \
libosmo-mtp-1_7_0 \
libosmo-mtp-1_7_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
