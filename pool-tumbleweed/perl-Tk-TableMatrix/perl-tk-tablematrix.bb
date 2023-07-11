SUMMARY = "Table/Matrix Widget Extension to perl/tk"
DESCRIPTION = "Tk::TableMatrix is a table/matrix widget extension to perl/tk \
for displaying data in a table (or spreadsheet) format."
LICENSE = "(Artistic-1.0 | GPL-1.0-or-later) & TCL"

PV = "1.29"

RPM_NAME = "perl-Tk-TableMatrix-1.29-2.2.aarch64.rpm"
RPM_HASH = "696f3e5c9b8df29fb91dd38888502fcbdc3edabc0db196805f4dc15411c034c6d69037d6d4b88d806cd8593b6e10c43d8a83018883dc833ceaa3db7e7d91dc60"

RPROVIDES:${PN} += "perl-Tk--TableMatrix \
perl-Tk--TableMatrix--Spreadsheet \
perl-Tk--TableMatrix--SpreadsheetHideRows \
perl-Tk-TableMatrix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1 \
perl-Tk"

inherit rpm
