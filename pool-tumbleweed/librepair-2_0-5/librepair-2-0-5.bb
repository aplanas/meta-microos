SUMMARY = "Repair library for the Reiser4 filesystem"
DESCRIPTION = "Reiser4 support library implementing filesystem repair logic."
LICENSE = "GPL-2.0-only"

PV = "2.0.5"

RPM_NAME = "librepair-2_0-5-2.0.5-1.7.aarch64.rpm"
RPM_HASH = "2d7e687b11f90813b9b2ef39708ef65c96b20162753abc7c2480a404bbfa1fe4525bbe7d2ac08b35af73f86236df758f1710eaed393fb9ff5e070468971ff15e"

RPROVIDES:${PN} += "librepair-2-0-5 \
librepair-2.0.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaal-1.0.so.7 \
libc.so.6 \
libreiser4-2.0.so.5 \
libuuid.so.1"

inherit rpm
