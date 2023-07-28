SUMMARY = "LibreOffice Impress"
DESCRIPTION = "This module allows you to create and edit presentations for slideshows, \
meeting and Web pages by using LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-impress-7.5.4.2-1.5.aarch64.rpm"
RPM_HASH = "94b07afee022b3138b9661f33a1ea6c69a39a1018aaad94af82ad10f9160d1e33363224444a8e8b896076aa82b7c1e7c4527425826b6f99e6c9e61fcaac14e79"

RPROVIDES:${PN} += "libOGLTranslo.so \
libPresentationMinimizerlo.so \
libPresenterScreenlo.so \
libreoffice-impress \
libwpftimpresslo.so"

RDEPENDS:${PN} += "/usr/bin/sh \
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
