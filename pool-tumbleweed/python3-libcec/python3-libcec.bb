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

RPM_NAME = "python3-libcec-6.0.2-3.1.aarch64.rpm"
RPM_HASH = "59d38489b4ab78847ef4cea1f91eb47655c07cb67407383048c3af3299ef307c485fb1783aa557a3e8acbf8652979d5e8207f45cab12e2fedf7f4cb3cc6c1e13"

RPROVIDES:${PN} += "python3-libcec"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcec.so.6 \
libgcc-s.so.1 \
libp8-platform.so.2 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
