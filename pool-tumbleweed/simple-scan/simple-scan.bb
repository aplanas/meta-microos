SUMMARY = "Simple Scanning Utility"
DESCRIPTION = "Simple Scan is an easy-to-use application, designed to let users connect \
their scanner and quickly have the image/document in an appropriate \
format. \
 \
Simple Scan is basically a frontend for SANE - which is the same backend \
as XSANE uses. This means that all existing scanners will work and the \
interface is well tested."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "simple-scan-44.0-1.2.aarch64.rpm"
RPM_HASH = "240e7bdc6c947d998cbad7db6cce3225d4816d5140fa2ca5370ba897a0926cd48a7ecccb3a65bc485cbf321a62c947f420854b8f58f9147b71091a42395dae49"

RPROVIDES:${PN} += "simple-scan"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libcolord.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgusb.so.2 \
libhandy-1.so.0 \
libm.so.6 \
libpackagekit-glib2.so.18 \
libsane.so.1 \
libwebp.so.7 \
libwebpmux.so.3 \
libz.so.1 \
xdg-utils"

inherit rpm
