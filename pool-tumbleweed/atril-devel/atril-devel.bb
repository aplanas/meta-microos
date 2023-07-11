SUMMARY = "MATE Desktop document viewer development files"
DESCRIPTION = "Atril is a document viewer capable of displaying multiple and single \
page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.1"

RPM_NAME = "atril-devel-1.26.1-1.2.aarch64.rpm"
RPM_HASH = "aeba59376afae40a969070ea67f5e97429f6c67f282056c32adfef0811d18995e3a31b64eaf3870f7649056b442d72954187d474c015da421e209bcc5a3a69d3"

RPROVIDES:${PN} += "atril-devel \
mate-document-viewer-devel \
pkgconfig-atril-document-1.5.0 \
pkgconfig-atril-view-1.5.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
atril-backends \
pkgconfig-gio-2.0 \
pkgconfig-gthread-2.0 \
pkgconfig-gtk+-3.0 \
typelib-1-0-AtrilDocument-1-5-0 \
typelib-1-0-AtrilView-1-5-0"

inherit rpm
