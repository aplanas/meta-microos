SUMMARY = "Documentation files for Gnumeric"
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

RPM_NAME = "gnumeric-doc-1.12.55-1.4.noarch.rpm"
RPM_HASH = "801226628f8f91a3822fc45d19a796b6a9d88bf360484a8718dfb3fa8cfa2468acdbcbb52fc6dae9566b68c75e110c89744fa29434bd48809b80b9d8be4a0bc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnumeric-doc"

RDEPENDS:${PN} += "gnumeric"

inherit rpm
