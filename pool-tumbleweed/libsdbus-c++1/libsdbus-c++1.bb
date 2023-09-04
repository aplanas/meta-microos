SUMMARY = "Shared library for sdbus-cpp"
DESCRIPTION = "Shared library files for sdbus-cpp."
LICENSE = "LGPL-2.1-only"

PV = "1.3.0"

RPM_NAME = "libsdbus-c++1-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "eea92a25734c5285d70d20125ec194e7c642ec312df46c40836a679968f80901bc0740b16650ba33d94ffc9b7edfb662817e67cca134c3ccf44012671c2e33e0"

RPROVIDES:${PN} += "libsdbus-c++.so.1 \
libsdbus-c++1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libsystemd.so.0"

inherit rpm
