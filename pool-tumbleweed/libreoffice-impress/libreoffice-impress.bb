SUMMARY = "LibreOffice Impress"
DESCRIPTION = "This module allows you to create and edit presentations for slideshows, \
meeting and Web pages by using LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-impress-7.5.4.2-1.3.aarch64.rpm"
RPM_HASH = "ccce380b51504820877b6aee92a6487a2b99885b5e46941a636cef0ce93090f17e0ec1ea9f2c45fc77d01e6c14379ca22743e0dac30fd75e20a1525cca646b4e"

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
