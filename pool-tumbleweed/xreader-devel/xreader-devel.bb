SUMMARY = "X-Apps Document Reader development files"
DESCRIPTION = "Xreader is a document viewer capable of displaying multiple and \
single page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.8.2"

RPM_NAME = "xreader-devel-3.8.2-1.1.aarch64.rpm"
RPM_HASH = "9d5c4ff602ddd6ba657ee91f5e87f7369693dc76de2dd8ef39f0ddc6ec56171f54c162acb2e1239eb51323a2c085a136cea4dfba272d6c554c093eb8f6fe6fde"

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
