SUMMARY = "X-Apps Document Reader development files"
DESCRIPTION = "Xreader is a document viewer capable of displaying multiple and \
single page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.4.5"

RPM_NAME = "xreader-devel-3.4.5-1.5.aarch64.rpm"
RPM_HASH = "e3b775dfe1709331530742deba99abfc3e3a6bd8278d76d3bd17a011c26533fa0eb6a81ecca6ef88f93c11eb3911f7cb12140c34d14dab37094e507f5d782517"

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
