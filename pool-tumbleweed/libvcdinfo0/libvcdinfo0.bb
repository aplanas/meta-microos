SUMMARY = "Video CD (VCD) authoring software"
DESCRIPTION = "GNU VCDImager is a full-featured mastering suite for authoring, \
disassembling and analyzing Video CDs and Super Video CDs. \
This is the core library"
LICENSE = "GPL-2.0-only"

PV = "2.0.1"

RPM_NAME = "libvcdinfo0-2.0.1-3.11.aarch64.rpm"
RPM_HASH = "e2f1e18822c7f6b45647b7865decd5adf6692cee1928bc47cf8ee6af4cd25d441dc270b32c5b8a83269dbdbd5ef0c4f9ce03c7c23a46d3c55ab93ae3eb11bd83"

RPROVIDES:${PN} += "libvcdinfo.so.0 \
libvcdinfo0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdio.so.19 \
libiso9660.so.11 \
libm.so.6"

inherit rpm
