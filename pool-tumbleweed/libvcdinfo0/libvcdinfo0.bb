SUMMARY = "Video CD (VCD) authoring software"
DESCRIPTION = "GNU VCDImager is a full-featured mastering suite for authoring, \
disassembling and analyzing Video CDs and Super Video CDs. \
This is the core library"
LICENSE = "GPL-2.0-only"

PV = "2.0.1"

RPM_NAME = "libvcdinfo0-2.0.1-3.12.aarch64.rpm"
RPM_HASH = "c3664b9c989e0a21af67e8a29e969f417a9d896851eaa88a9846ec1e5b74a7026ec83b7036df92317f8f9c28ea5204978b7e179a9ca9b70fb07d48b16b6da4d9"

RPROVIDES:${PN} += "libvcdinfo.so.0 \
libvcdinfo0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdio.so.19 \
libiso9660.so.11 \
libm.so.6"

inherit rpm
