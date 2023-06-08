SUMMARY = "MATE Desktop document viewer development files"
DESCRIPTION = "Atril is a document viewer capable of displaying multiple and single \
page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.0"

RPM_NAME = "atril-devel-1.26.0-1.11.aarch64.rpm"
RPM_HASH = "5d25722618c35ce98da56acc95010ec5cffe069fb8e7d86ee49b904f042ba2fc1a57c28b1e02621eeb44c482e428787cc793df4b449591c77a0f0b74ec2c0a08"

RPROVIDES:${PN} += "atril-devel atril-devel(aarch-64) mate-document-viewer-devel pkgconfig(atril-document-1.5.0) pkgconfig(atril-view-1.5.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config atril-backends pkgconfig(gio-2.0) pkgconfig(gthread-2.0) pkgconfig(gtk+-3.0) typelib-1_0-AtrilDocument-1_5_0 typelib-1_0-AtrilView-1_5_0"

inherit rpm
