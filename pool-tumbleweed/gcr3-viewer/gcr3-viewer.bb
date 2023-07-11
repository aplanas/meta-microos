SUMMARY = "Viewer for Crypto Files"
DESCRIPTION = "This packages provides the viewer for crypto files on the GNOME desktop."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.0"

RPM_NAME = "gcr3-viewer-3.41.0-3.4.aarch64.rpm"
RPM_HASH = "60027f0b392e02543df5efaa63c246af0c196113ef3b1040259ecca4115df9bfc17c512cd9e9208661d2b3c7dc1eb87955df569179ab17fa076b7f53ef9f0389"

RPROVIDES:${PN} += "gcr-viewer \
gcr3-viewer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcr-ui-3.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
