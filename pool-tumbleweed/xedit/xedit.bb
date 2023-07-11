SUMMARY = "Simple text editor for X"
DESCRIPTION = "Xedit is a simple text editor for X."
LICENSE = "MIT"

PV = "1.2.3"

RPM_NAME = "xedit-1.2.3-2.5.aarch64.rpm"
RPM_HASH = "21bc6366fbfebe7e24df5dbd08050bb55f92e5e17bf50b9f7223c4a6304c7d903940bb44e751116b1592343720e35a2aee35ac5c00d92f340894b1fb947cac2c"

RPROVIDES:${PN} += "xedit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
