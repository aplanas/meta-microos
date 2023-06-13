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

RPM_NAME = "gnumeric-1.12.55-1.3.aarch64.rpm"
RPM_HASH = "bcb964df3ba65e0fab4bcf3fa9a1186c5999a679f1e30205bc748603604ae166d52e93dddc4266d5529e4d07e54d2494673ec85fe57e17e5051f8a50f7928307"

RPROVIDES:${PN} += "application() \
application(gnumeric.desktop) \
gnumeric \
gnumeric(aarch-64) \
gnumeric2 \
libspreadsheet-1.12.55.so()(64bit) \
metainfo() \
metainfo(gnumeric.appdata.xml) \
mimehandler(application/excel) \
mimehandler(application/msexcel) \
mimehandler(application/tab-separated-values) \
mimehandler(application/vnd.lotus-1-2-3) \
mimehandler(application/vnd.ms-excel) \
mimehandler(application/vnd.oasis.opendocument.spreadsheet) \
mimehandler(application/vnd.openxmlformats-officedocument.spreadsheetml.sheet) \
mimehandler(application/vnd.sun.xml.calc) \
mimehandler(application/vnd.sun.xml.calc.template) \
mimehandler(application/x-123) \
mimehandler(application/x-applix-spreadsheet) \
mimehandler(application/x-dbase) \
mimehandler(application/x-dbf) \
mimehandler(application/x-dos_ms_excel) \
mimehandler(application/x-excel) \
mimehandler(application/x-gnumeric) \
mimehandler(application/x-mps) \
mimehandler(application/x-ms-excel) \
mimehandler(application/x-msexcel) \
mimehandler(application/x-oleo) \
mimehandler(application/x-planperfect) \
mimehandler(application/x-quattropro) \
mimehandler(application/x-sc) \
mimehandler(application/x-sylk) \
mimehandler(application/x-xbase) \
mimehandler(application/x-xls) \
mimehandler(application/xls) \
mimehandler(text/csv) \
mimehandler(text/spreadsheet) \
mimehandler(text/tab-separated-values) \
mimehandler(text/x-csv)"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgda-6.0.so.6.0.0()(64bit) \
libgda-ui-6.0.so.6.0.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgoffice-0.10.so.10()(64bit) \
libgsf-1.so.114()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libperl.so()(64bit) \
libxml2.so.2()(64bit) \
libz.so.1()(64bit) \
perl \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
