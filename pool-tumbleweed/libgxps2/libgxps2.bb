SUMMARY = "Library for rendering XPS documents"
DESCRIPTION = "libgxps is a GObject based library for handling and rendering XPS \
documents."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.2"

RPM_NAME = "libgxps2-0.3.2-1.12.aarch64.rpm"
RPM_HASH = "3973a8b9f1bcc085afd91ae1de65edd0d26cf60577fd8bbc770e61fc0d7647916d4721716303f303db731975151425e6f252be7af02244cec00eca3e7b5c42b4"

RPROVIDES:${PN} += "libgxps.so.2 \
libgxps2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libcairo.so.2 \
libfreetype.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libpng16.so.16 \
libtiff.so.6"

inherit rpm
