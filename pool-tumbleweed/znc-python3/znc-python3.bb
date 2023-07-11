SUMMARY = "Python support for ZNC"
DESCRIPTION = "ZNC is an IRC bouncer with many features like detaching, multiple \
users, per channel playback buffer, SSL, IPv6, transparent DCC bouncing, and \
C++ module support. \
 \
This package contains the Python extension to ZNC."
LICENSE = "Apache-2.0"

PV = "1.8.2"

RPM_NAME = "znc-python3-1.8.2-3.8.aarch64.rpm"
RPM_HASH = "ab10b0a2530aebf7121b7e74a28defb1a5a3fbf29da7741c1ce35411ce0a41093942b41ebb6104cf1a7cc59d81a2ef0f53dfeb3b8a7b3c91ec3fa0ffaf72603e"

RPROVIDES:${PN} += "znc-python \
znc-python3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
python3 \
znc"

inherit rpm
