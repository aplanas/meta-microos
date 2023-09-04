SUMMARY = "Document viewer for documents like PDF/PostScript"
DESCRIPTION = "Xreader is a document viewer capable of displaying multiple and \
single page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.8.2"

RPM_NAME = "xreader-3.8.2-1.1.aarch64.rpm"
RPM_HASH = "3deb65dfc2afa9077c4876fa39a24143db2c0dab3e6474a1c95ea5a07d48c59f45ca6f3b54779cb2ea6f29def51749fef6b8e4c5861468e945f55e69941c84d2"

RPROVIDES:${PN} += "caja-extension-xreader \
nemo-extension-xreader \
xreader \
xreader-backends"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libxapp.so.1 \
libxreaderdocument.so.3 \
libxreaderview.so.3 \
xreader-plugin-pdfdocument"

inherit rpm
