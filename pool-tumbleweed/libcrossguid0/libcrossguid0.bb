SUMMARY = "C++ GUID/UUID library"
DESCRIPTION = "Lightweight cross platform C++ GUID/UUID library"
LICENSE = "MIT"

PV = "0.2.2.20190529T083634.ca1bf4b"

RPM_NAME = "libcrossguid0-0.2.2.20190529T083634.ca1bf4b-2.2.aarch64.rpm"
RPM_HASH = "061db5948a4fd62572f5c5bccec7cd3bf1c1a0ca5c038f76bf3761b4187f51f006d032a0d2ab3ec0aca77b95bf0f8de89c29fbd27517ff401b4c0a3ed66f4d9c"

RPROVIDES:${PN} += "libcrossguid.so.0 \
libcrossguid0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libuuid.so.1"

inherit rpm
