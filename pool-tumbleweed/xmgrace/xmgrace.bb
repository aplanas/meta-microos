SUMMARY = "A 2D-Plot-Program for Visualisation of Scientific Data"
DESCRIPTION = "Grace is a WYSIWYG 2D plotting tool for the X Window System and M*tif. \
Grace is a descendant of ACE/gr, also known as Xmgr. It knows a lot of \
different graph types and supports a lot of output formats. \
 \
For examples, see /usr/lib/xmgrace/examples."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.25"

RPM_NAME = "xmgrace-5.1.25-4.6.aarch64.rpm"
RPM_HASH = "9d9ac95346290a1609a7051d947496c866b004b0a735d8b6cf1b5f513c424a00be5aa9c0c940b98c1da6a039ce8173348cb6bc7f56b817206efc5372e37e49d8"

RPROVIDES:${PN} += "application() \
application(xmgrace.desktop) \
xmgrace \
xmgrace(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXm.so.4()(64bit) \
libXt.so.6()(64bit) \
libc.so.6()(64bit) \
libjpeg.so.8()(64bit) \
libm.so.6()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit)"

inherit rpm
