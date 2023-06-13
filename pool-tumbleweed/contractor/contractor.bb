SUMMARY = "A desktop-wide extension service"
DESCRIPTION = "An extension service that allows apps to use the exposed functionality of \
registered apps. This way, applications do not have to have the functions \
hard coded into them. \
 \
Designed for Elementary OS."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.5"

RPM_NAME = "contractor-0.3.5-1.3.aarch64.rpm"
RPM_HASH = "66dbadc7881cb1a7e2d6f1833dbd67c4f060fed4491b0e83756638928c4b34cc544ce25942c89bac6f1dc22643654abcdd64bfeccc809df639855fbfa6ba2a23"

RPROVIDES:${PN} += "contractor \
contractor(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
