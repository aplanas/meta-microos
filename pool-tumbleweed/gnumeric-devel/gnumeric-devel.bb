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

RPM_NAME = "gnumeric-devel-1.12.55-1.3.aarch64.rpm"
RPM_HASH = "00436f09084887bee52606b6c326ea5e0f8f43d225b67eca61dd6b64409687e7d9d13daf87d8b1de1c51bb6a4d7fa0e01c74af2cd2b4c718a726a6fde241b892"

RPROVIDES:${PN} += "gnumeric-devel \
gnumeric-devel(aarch-64) \
pkgconfig(libspreadsheet-1.12)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnumeric \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(gtk+-3.0) \
pkgconfig(libgoffice-0.10) \
pkgconfig(libgsf-1) \
pkgconfig(libxml-2.0)"

inherit rpm
