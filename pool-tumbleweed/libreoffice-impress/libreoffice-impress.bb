SUMMARY = "LibreOffice Impress"
DESCRIPTION = "This module allows you to create and edit presentations for slideshows, \
meeting and Web pages by using LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-impress-7.5.4.1-1.1.aarch64.rpm"
RPM_HASH = "5a478986b52a3c17ae3c0ece12be5c74dba1081b5c94b58eeac9f1aebf91c20b282628781089ff7aa24c5c6d8e4fc6e05b0a113775fd0288677d3fba823f9f22"

RPROVIDES:${PN} += "libOGLTranslo.so \
libPresentationMinimizerlo.so \
libPresenterScreenlo.so \
libreoffice-impress \
libwpftimpresslo.so"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libepoxy.so.0 \
libetonyek-0.1.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libmergedlo.so \
libmwaw-0.3.so.3 \
libodfgen-0.1.so.1 \
libreoffice \
librevenge-0.0.so.0 \
libstaroffice-0.0.so.0 \
libstdc++.so.6 \
libuno-cppu.so.3 \
libuno-cppuhelpergcc3.so.3 \
libuno-sal.so.3 \
libwriterperfectlo.so \
rtld-GNU-HASH"

inherit rpm
