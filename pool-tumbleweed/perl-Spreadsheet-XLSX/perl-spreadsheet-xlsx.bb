SUMMARY = "Perl extension for reading MS Excel 2007 files;"
DESCRIPTION = "This module is a (quick and dirty) emulation of Spreadsheet::ParseExcel for \
Excel 2007 (.xlsx) file format. It supports styles and many of Excel's \
quirks, but not all. It populates the classes from Spreadsheet::ParseExcel \
for interoperability; including Workbook, Worksheet, and Cell."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.17"

RPM_NAME = "perl-Spreadsheet-XLSX-0.17-1.10.noarch.rpm"
RPM_HASH = "806c717757c611180525b0862e5a78b1446b32f2b499922287eb91498c3cb255e6966695c84afcfaf5e40bd06822d855e2a845ee9a296495be7e9e555b514eb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Spreadsheet--XLSX \
perl-Spreadsheet--XLSX--Fmt2007 \
perl-Spreadsheet--XLSX--Utility2007 \
perl-Spreadsheet-XLSX"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Archive--Zip \
perl-Spreadsheet--ParseExcel"

inherit rpm
