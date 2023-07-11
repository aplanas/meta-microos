SUMMARY = "Spreadsheet Application"
DESCRIPTION = "Gnumeric is a spreadsheet application with advanced features and \
analytics.  It aims to minimize the cost of transition from proprietary \
spreadsheets by offering a familiar look and feature set.  In addition \
to read and write support for all versions of Microsoft Excel \
(including reading encrypted files), there is also support for many \
other formats including: \
 \
*Applix 4 and 5 *DIF *Lotus-123 (wk1, wk2, wk3) *OpenOffice.org (Oasis) \
*PlanPerfect (pln) *Psion5 *Quattro Pro (wb1, wb2, wb3) *SYLK \
*XBase/DB3 \
 \
Text formats, such as comma or tab separated values, HTML, XHTML, and \
Latex, are supported and there are powerful assistants to handle custom \
needs. \
 \
Gnumeric is part of the GNOME project."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "1.12.55"

RPM_NAME = "gnumeric-devel-1.12.55-1.4.aarch64.rpm"
RPM_HASH = "79af5d5a7fda471723f2e339d9bcb2fddc14c9829409c2b840a360db3838cb34c4c5d1acade3337dab61f90aec2d193e2bd65388149e72d06573b8039387e0fb"

RPROVIDES:${PN} += "gnumeric-devel \
pkgconfig-libspreadsheet-1.12"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnumeric \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libgoffice-0.10 \
pkgconfig-libgsf-1 \
pkgconfig-libxml-2.0"

inherit rpm
