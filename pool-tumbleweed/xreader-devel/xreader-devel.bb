SUMMARY = "X-Apps Document Reader development files"
DESCRIPTION = "Xreader is a document viewer capable of displaying multiple and \
single page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.4.5"

RPM_NAME = "xreader-devel-3.4.5-1.4.aarch64.rpm"
RPM_HASH = "e18874b34b763358abde0085ef9c1a4cb93acaa6d0d11798ac6b349fc42c6b81b565f5b2e1c3e230519f85125b6898428fdce4ca72b09368ccb7804017fee15f"

RPROVIDES:${PN} += "pkgconfig-xreader-document-1.5 \
pkgconfig-xreader-view-1.5 \
xreader-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-gio-2.0 \
pkgconfig-gthread-2.0 \
pkgconfig-gtk+-3.0 \
typelib-1-0-XreaderDocument-1-5 \
typelib-1-0-XreaderView-1-5"

inherit rpm
