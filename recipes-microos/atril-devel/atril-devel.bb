SUMMARY = "MATE Desktop document viewer development files"
DESCRIPTION = "Atril is a document viewer capable of displaying multiple and single \
page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.1"

RPM_NAME = "atril-devel-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "84f983015156747167375be1403265590b22cc1826916c19547efb233f26603808282e88d425667ca0e0e7b60154c3104026316b4143263e6f023280a9fc206f"

RPROVIDES:${PN} += "atril-devel atril-devel(aarch-64) mate-document-viewer-devel pkgconfig(atril-document-1.5.0) pkgconfig(atril-view-1.5.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config atril-backends pkgconfig(gio-2.0) pkgconfig(gthread-2.0) pkgconfig(gtk+-3.0) typelib-1_0-AtrilDocument-1_5_0 typelib-1_0-AtrilView-1_5_0"

inherit rpm
