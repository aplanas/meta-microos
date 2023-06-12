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

RPM_NAME = "gnumeric-doc-1.12.55-1.3.noarch.rpm"
RPM_HASH = "c192c4d04dc15f97544f33e53743bbdef526393b3c83589bdd694f7a93a7ddeeb616d1695ef3ecbf3a36b90f3308f589db845cd9b7f5bad281070415d0b7229e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnumeric-doc"
RDEPENDS:${PN} += "gnumeric"

inherit rpm
