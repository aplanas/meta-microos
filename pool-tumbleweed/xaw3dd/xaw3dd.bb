SUMMARY = "Select 3D Athena Widgets as a replacement for Athena Widgets"
DESCRIPTION = "Installation of this package will cause programs utilizing the Athena \
Widget Toolkit to instead use the 3D Athena Widget set. \
 \
If any problems arise using or starting X Window System programs, \
remove this package."
LICENSE = "MIT"

PV = "1.6.5"

RPM_NAME = "xaw3dd-1.6.5-1.1.aarch64.rpm"
RPM_HASH = "fb36870b6a1f2275ba8a33322313e8bd399836540e8db84b229ef0cd216e14788ce5194fa769caab094485c084b11a637cc5715acb47e65440f355d39ed11e01"

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
