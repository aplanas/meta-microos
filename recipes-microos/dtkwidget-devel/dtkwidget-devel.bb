SUMMARY = "Development tools for dtkwidget"
DESCRIPTION = "The dtkwidget-devel package contains the header files and developer \
docs for dtkcore."
LICENSE = "LGPL-3.0-only"

PV = "5.5.52"

RPM_NAME = "dtkwidget-devel-5.5.52-1.7.aarch64.rpm"
RPM_HASH = "15b5cecab534e55fa2bf77787770ae4b377618d5089b8b9f20256985e6ef287dd7ab3f5244f5a7c7f67d61154f0318fd12c9f1c9d7154bb818a3faceba44243f"

RPROVIDES:${PN} += "cmake(DtkWidget) dtkwidget-devel dtkwidget-devel(aarch-64) pkgconfig(dtkwidget)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libdtkwidget5 pkgconfig(dtkcore) pkgconfig(dtkgui)"

inherit rpm
