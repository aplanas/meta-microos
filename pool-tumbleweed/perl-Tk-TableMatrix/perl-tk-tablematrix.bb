SUMMARY = "Table/Matrix Widget Extension to perl/tk"
DESCRIPTION = "Tk::TableMatrix is a table/matrix widget extension to perl/tk \
for displaying data in a table (or spreadsheet) format."
LICENSE = "(Artistic-1.0 | GPL-1.0-or-later) & TCL"

PV = "1.29"

RPM_NAME = "perl-Tk-TableMatrix-1.29-2.3.aarch64.rpm"
RPM_HASH = "0a11c4f17bab864ae62eaf767ee8f7869cb6affb47a087e5ed1181981c0febafa9590f0ba816f36df2d8c15735b0bf72445deb18104a6f6a6f9321017970940b"

RPROVIDES:${PN} += "perl-Tk--TableMatrix \
perl-Tk--TableMatrix--Spreadsheet \
perl-Tk--TableMatrix--SpreadsheetHideRows \
perl-Tk-TableMatrix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-Tk"

inherit rpm
