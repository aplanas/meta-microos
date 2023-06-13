SUMMARY = "LibreOffice Draw"
DESCRIPTION = "This module allows you to create and edit drawings, flow charts, and \
logos by using LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-draw-7.5.4.1-1.1.aarch64.rpm"
RPM_HASH = "868859b5e0ec066ddba5747020147cf7a512549422f64050482944c1d40fee5f540c74b38dac39ffb8f520434a94ce6869055b24edaa4dc6a4896adff790ced7"

RPROVIDES:${PN} += "application() \
application(libreoffice-draw.desktop) \
libpdfimportlo.so()(64bit) \
libreoffice-draw \
libreoffice-draw(aarch-64) \
metainfo() \
metainfo(libreoffice-draw.appdata.xml) \
mimehandler(application/clarisworks) \
mimehandler(application/pdf) \
mimehandler(application/vnd.corel-draw) \
mimehandler(application/vnd.ms-publisher) \
mimehandler(application/vnd.oasis.opendocument.graphics) \
mimehandler(application/vnd.oasis.opendocument.graphics-flat-xml) \
mimehandler(application/vnd.oasis.opendocument.graphics-template) \
mimehandler(application/vnd.sun.xml.draw) \
mimehandler(application/vnd.sun.xml.draw.template) \
mimehandler(application/vnd.visio) \
mimehandler(application/x-pagemaker) \
mimehandler(application/x-stardraw) \
mimehandler(application/x-wpg) \
mimehandler(image/x-emf) \
mimehandler(image/x-freehand) \
mimehandler(image/x-wmf)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libmergedlo.so()(64bit) \
libpoppler.so.128()(64bit) \
libreoffice \
libstdc++.so.6()(64bit) \
libuno_cppu.so.3()(64bit) \
libuno_cppu.so.3(UDK_3_0_0)(64bit) \
libuno_cppuhelpergcc3.so.3()(64bit) \
libuno_cppuhelpergcc3.so.3(UDK_3_0_0)(64bit) \
libuno_sal.so.3()(64bit) \
libuno_sal.so.3(UDK_3_0_0)(64bit) \
libz.so.1()(64bit) \
rtld(GNU_HASH)"

inherit rpm
