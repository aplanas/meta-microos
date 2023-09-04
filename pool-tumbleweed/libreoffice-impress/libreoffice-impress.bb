SUMMARY = "LibreOffice Impress"
DESCRIPTION = "This module allows you to create and edit presentations for slideshows, \
meeting and Web pages by using LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-impress-7.6.0.3-1.1.aarch64.rpm"
RPM_HASH = "ff000e61a5a1871e04bd3c220e0e49a5d79d7055d3c88081eb35baffc97c0474fc2cb59716e16bddc044313a06e986b67be516227fd5eca99151387aeb8e2e25"

RPROVIDES:${PN} += "libOGLTranslo.so \
libPresentationMinimizerlo.so \
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
