SUMMARY = "Runtime library needed by both fax server and client"
DESCRIPTION = "This runtime lib is needed by both the fax server and the client."
LICENSE = "BSD-3-Clause"

PV = "7.0.7"

RPM_NAME = "libfaxutil7_0_7-7.0.7-1.4.aarch64.rpm"
RPM_HASH = "2f11df180127944b0d8634224da818c88e12e722562ece2887005b5aaac5adb72f4b4e5a274e2ef7501179e963b5208db320858b01dcb9b565b917de006773cf"

RPROVIDES:${PN} += "libfaxutil.so.7.0.7 \
libfaxutil7-0-7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtiff.so.6 \
libz.so.1"

inherit rpm
