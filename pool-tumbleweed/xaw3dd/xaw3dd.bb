SUMMARY = "Select 3D Athena Widgets as a replacement for Athena Widgets"
DESCRIPTION = "Installation of this package will cause programs utilizing the Athena \
Widget Toolkit to instead use the 3D Athena Widget set. \
 \
If any problems arise using or starting X Window System programs, \
remove this package."
LICENSE = "MIT"

PV = "1.6.4"

RPM_NAME = "xaw3dd-1.6.4-1.4.aarch64.rpm"
RPM_HASH = "f81da98b7de22980c8ba5609d66f98b8da1fa29a8dec42b40bc23370a3d2fe4d931387ee05237973c9ee7bba9027f72bd914d88248a5dff4ba3bb30c121c7759"

RPROVIDES:${PN} += "config-xaw3dd \
libXaw.so.6 \
libXaw.so.7 \
libXaw.so.8 \
xaw3dd"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw3d6 \
libXaw3d7 \
libXaw3d8 \
libXext.so.6 \
libXmu.so.6 \
libXpm.so.4 \
libXt.so.6 \
libc.so.6"

inherit rpm
