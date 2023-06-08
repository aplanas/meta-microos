SUMMARY = "Control your device with your TV remote control via HDMI"
DESCRIPTION = "In combination with the right hardware, libcec allows to control \
a device with a TV remote control utilizing existing HDMI \
cabling. \
 \
libCEC is an enabling platform for the CEC bus in HDMI, it allows \
developers to interact with other HDMI devices without having to \
worry about the communication overhead, handshaking, and the various \
ways of sending a message for each vendor. \
 \
This package contains the client applications."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.2"

RPM_NAME = "cec-client-6.0.2-2.9.aarch64.rpm"
RPM_HASH = "d27f26aac5a244c25e02e90c1e0c0dc8eb5e6288e1a57d0f6b992f4cc69b03932396ff166f3d7917980912eb1adfba46ca6e70cdc6dfeeaca0c9ddc3434442fe"

RPROVIDES:${PN} += "cec-client cec-client(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcec6 libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libp8-platform.so.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
