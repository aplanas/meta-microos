SUMMARY = "C++ GUID/UUID library"
DESCRIPTION = "Lightweight cross platform C++ GUID/UUID library"
LICENSE = "MIT"

PV = "0.2.2.20190529T083634.ca1bf4b"

RPM_NAME = "libcrossguid0-0.2.2.20190529T083634.ca1bf4b-2.1.aarch64.rpm"
RPM_HASH = "13020a0f5ea19ce4146b1d1535832fb6771bc006975f76c9dcb3d2f3bcc53af9b16632e5935dc928fa9ee69a16763a5dc9bc2fb5ac772cfeb537ac4e1af6d960"

RPROVIDES:${PN} += "libcrossguid.so.0 \
libcrossguid0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libuuid.so.1"

inherit rpm
