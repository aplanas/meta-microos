SUMMARY = "Ghostview"
DESCRIPTION = "Ghostview offers an X11 GUI for viewing PostScript files. This is an \
X11 interface to ghostscript."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "ghostview-1.5-444.19.aarch64.rpm"
RPM_HASH = "1316754655ec88ab1592c3b0e076e002dee9c46f4e258478c3839562891e151c5385e706a0702c107c07ca5765441d488d1f503e9d95c89659544a1746993da1"

RPROVIDES:${PN} += "application() \
application(ghostview.desktop) \
config(ghostview) \
ghostview \
ghostview(aarch-64) \
ghstview \
gsview \
mimehandler(application/pdf) \
mimehandler(application/postscript) \
mimehandler(image/x-eps)"

RDEPENDS:${PN} += "ghostscript_x11 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXaw.so.7()(64bit) \
libXmu.so.6()(64bit) \
libXt.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
