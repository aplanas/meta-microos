SUMMARY = "Viewer for Crypto Files"
DESCRIPTION = "This packages provides the viewer for crypto files on the GNOME desktop."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.0"

RPM_NAME = "gcr3-viewer-3.41.0-3.3.aarch64.rpm"
RPM_HASH = "d079a674a1faec9e6c082e301a49aaab7fd4b8ced6c1968eb2339f01657841c8babbfbb8520b63ecf2434a138ca0c8aaa6c06ec35e23479683bc442d93c7a891"

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
