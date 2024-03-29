SUMMARY = "X Damage Extension library"
DESCRIPTION = "The X Damage Extension allows applications to track modified regions \
of drawables."
LICENSE = "MIT"

PV = "1.1.6"

RPM_NAME = "libXdamage1-1.1.6-1.2.aarch64.rpm"
RPM_HASH = "58d6bd56585bc9cdcb96faa748ded7c8286fb937396f461a803f9f512ef80521424dd51c4c41b167044424fd3f17ef40df3aa469a06dbcb80ef107ece34617dd"

RPROVIDES:${PN} += "libXdamage.so.1 \
libXdamage1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
