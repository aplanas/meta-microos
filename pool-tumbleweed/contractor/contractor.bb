SUMMARY = "A desktop-wide extension service"
DESCRIPTION = "An extension service that allows apps to use the exposed functionality of \
registered apps. This way, applications do not have to have the functions \
hard coded into them. \
 \
Designed for Elementary OS."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.5"

RPM_NAME = "contractor-0.3.5-1.4.aarch64.rpm"
RPM_HASH = "3f640928c560d50db11517d8dbf98835bc3b87c972ff326f338941ed9171135b89f23cdb5f69858b33184728526d850ed84c37f49f3bc95f4938d40922e63038"

RPROVIDES:${PN} += "contractor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
