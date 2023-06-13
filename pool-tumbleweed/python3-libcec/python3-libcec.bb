SUMMARY = "Python bindings for libcec"
DESCRIPTION = "In combination with the right hardware, libcec allows to control \
a device with a TV remote control utilizing existing HDMI \
cabling. \
 \
libCEC is an enabling platform for the CEC bus in HDMI, it allows \
developers to interact with other HDMI devices without having to \
worry about the communication overhead, handshaking, and the various \
ways of sending a message for each vendor. \
 \
This package contains the Python bindings."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.2"

RPM_NAME = "python3-libcec-6.0.2-2.9.aarch64.rpm"
RPM_HASH = "b94e4fcf224e99bbbdf4d3eba2e94c75bbc529c57df8925d6bff338751dd71a74f62486772180c91af66964103289d21a9484fd7d512194b07387282034c69b0"

RPROVIDES:${PN} += "python3-libcec \
python3-libcec(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcec.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libp8-platform.so.2()(64bit) \
libpython3.10.so.1.0()(64bit) \
libstdc++.so.6()(64bit) \
python(abi)"

inherit rpm
