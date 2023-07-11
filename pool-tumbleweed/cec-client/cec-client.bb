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

RPM_NAME = "cec-client-6.0.2-3.1.aarch64.rpm"
RPM_HASH = "821a0e613203339c899e084ad8430e509d0d143eeb5831bc2ada8363bd8141124c414c3dd44f1d7f982731be2912896bd3889ee015ab9acdf02209af6e34b195"

RPROVIDES:${PN} += "cec-client"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcec6 \
libgcc-s.so.1 \
libp8-platform.so.2 \
libstdc++.so.6"

inherit rpm
