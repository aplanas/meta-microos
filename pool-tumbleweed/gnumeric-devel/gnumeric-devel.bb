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

RPM_NAME = "gnumeric-devel-1.12.55-1.5.aarch64.rpm"
RPM_HASH = "3d5673efc0b5125fe559e9954e48234ec6ed39a1a3cb9ff12f5ab096e9a3400d0478369994fb367a5c0bd52619461fe919979a260d306ea7be8df20187d0842a"

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
