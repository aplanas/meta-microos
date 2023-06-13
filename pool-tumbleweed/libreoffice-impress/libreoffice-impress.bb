SUMMARY = "LibreOffice Impress"
DESCRIPTION = "This module allows you to create and edit presentations for slideshows, \
meeting and Web pages by using LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-impress-7.5.4.1-1.1.aarch64.rpm"
RPM_HASH = "5a478986b52a3c17ae3c0ece12be5c74dba1081b5c94b58eeac9f1aebf91c20b282628781089ff7aa24c5c6d8e4fc6e05b0a113775fd0288677d3fba823f9f22"

RPROVIDES:${PN} += "application() \
application(libreoffice-impress.desktop) \
libOGLTranslo.so()(64bit) \
libPresentationMinimizerlo.so()(64bit) \
libPresenterScreenlo.so()(64bit) \
libreoffice-impress \
libreoffice-impress(aarch-64) \
libwpftimpresslo.so()(64bit) \
metainfo() \
metainfo(libreoffice-impress.appdata.xml) \
mimehandler(application/mspowerpoint) \
mimehandler(application/vnd.apple.keynote) \
mimehandler(application/vnd.ms-powerpoint) \
mimehandler(application/vnd.ms-powerpoint.presentation.macroEnabled.12) \
mimehandler(application/vnd.ms-powerpoint.slideshow.macroEnabled.12) \
mimehandler(application/vnd.ms-powerpoint.template.macroEnabled.12) \
mimehandler(application/vnd.oasis.opendocument.presentation) \
mimehandler(application/vnd.oasis.opendocument.presentation-flat-xml) \
mimehandler(application/vnd.oasis.opendocument.presentation-template) \
mimehandler(application/vnd.openxmlformats-officedocument.presentationml.presentation) \
mimehandler(application/vnd.openxmlformats-officedocument.presentationml.slide) \
mimehandler(application/vnd.openxmlformats-officedocument.presentationml.slideshow) \
mimehandler(application/vnd.openxmlformats-officedocument.presentationml.template) \
mimehandler(application/vnd.sun.xml.impress) \
mimehandler(application/vnd.sun.xml.impress.template) \
mimehandler(application/x-iwork-keynote-sffkey)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libepoxy.so.0()(64bit) \
libetonyek-0.1.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libmergedlo.so()(64bit) \
libmwaw-0.3.so.3()(64bit) \
libodfgen-0.1.so.1()(64bit) \
libreoffice \
librevenge-0.0.so.0()(64bit) \
libstaroffice-0.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libuno_cppu.so.3()(64bit) \
libuno_cppu.so.3(UDK_3_0_0)(64bit) \
libuno_cppuhelpergcc3.so.3()(64bit) \
libuno_cppuhelpergcc3.so.3(UDK_3_0_0)(64bit) \
libuno_sal.so.3()(64bit) \
libuno_sal.so.3(UDK_3_0_0)(64bit) \
libwriterperfectlo.so()(64bit) \
rtld(GNU_HASH)"

inherit rpm
