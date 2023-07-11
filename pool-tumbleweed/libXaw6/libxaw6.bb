SUMMARY = "The X Athena Widget Set"
DESCRIPTION = "The X Window System Athena widget set implements simple user \
interfaces based upon the X Toolkit Intrinsics (Xt) library."
LICENSE = "MIT"

PV = "1.0.15"

RPM_NAME = "libXaw6-1.0.15-1.4.aarch64.rpm"
RPM_HASH = "18e11e461cede8bd96326507861331faa7b3ef735d53187e40075faebe7bd2cb8a41007b49b63bd4e8794217150a5ac50956d20791213044c1877ae1730ebdbf"

RPROVIDES:${PN} += "libXaw.so.6 \
libXaw6 \
libXaw6.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6"

inherit rpm
