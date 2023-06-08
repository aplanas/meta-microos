SUMMARY = "Header files for the Evince Document Viewer"
DESCRIPTION = "Evince is a document viewer capable of displaying single-page and multi-page \
document formats like PDF and PostScript. \
 \
This package contains the header files for building additional plugins."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "evince-devel-44.1-1.1.aarch64.rpm"
RPM_HASH = "6283c4f70e23eec1d58b904261c9db37e8a2a9b59b0fd211f805ebaec99a9408afe1b313fd63e06beb9b60dc76674956f9701336e530c14129efd1953b23aa18"

RPROVIDES:${PN} += "evince-devel evince-devel(aarch-64) pkgconfig(evince-document-3.0) pkgconfig(evince-view-3.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config evince libevdocument3-4 libevview3-3 pkgconfig(gio-2.0) pkgconfig(gthread-2.0) pkgconfig(gtk+-3.0) typelib-1_0-EvinceDocument-3_0 typelib-1_0-EvinceView-3_0"

inherit rpm
