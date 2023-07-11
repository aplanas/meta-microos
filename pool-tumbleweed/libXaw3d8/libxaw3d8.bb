SUMMARY = "The 3D Athena Widget Set"
DESCRIPTION = "Xaw3d is a general-purpose replacement for the Athena toolkit which \
adds a 3D appearance and support for XPM images."
LICENSE = "MIT"

PV = "1.6.4"

RPM_NAME = "libXaw3d8-1.6.4-1.4.aarch64.rpm"
RPM_HASH = "6f38b9397f31f5725d725863321c36983c406786f5e7e854c00cf2ed58f2f44e5aa95562df0866a21d29248b2f0c120032e0b1d52bf5c5f1832fbe569b20d15d"

RPROVIDES:${PN} += "Xaw3d \
libXaw3d.so.8 \
libXaw3d8 \
xaw3d"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXmu.so.6 \
libXpm.so.4 \
libXt.so.6 \
libc.so.6"

inherit rpm
