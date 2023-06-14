SUMMARY = "PDF support for zathura via poppler"
DESCRIPTION = "The zathura-pdf-poppler plugin adds PDF support to zathura by using the poppler rendering engine."
LICENSE = "Zlib"

PV = "0.3.1"

RPM_NAME = "zathura-plugin-pdf-poppler-0.3.1-1.2.aarch64.rpm"
RPM_HASH = "98fecc881b247d2f02eb2d78af0a7bdbad8cd61eceb9508397c80304d4d93c0a2591d1c02ea2ba1f72a6f296780434051b93320d4d940c6542c7319e6026bcc2"

RPROVIDES:${PN} += "libpdf-poppler.so \
zathura-pdf-poppler-plugin \
zathura-plugin-pdf-poppler"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgirara-gtk3.so.3 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpoppler-glib.so.8 \
zathura"

inherit rpm
