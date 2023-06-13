SUMMARY = "Perl extension for reading MS Excel 2007 files;"
DESCRIPTION = "This module is a (quick and dirty) emulation of Spreadsheet::ParseExcel for \
Excel 2007 (.xlsx) file format. It supports styles and many of Excel's \
quirks, but not all. It populates the classes from Spreadsheet::ParseExcel \
for interoperability; including Workbook, Worksheet, and Cell."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.17"

RPM_NAME = "perl-Spreadsheet-XLSX-0.17-1.8.noarch.rpm"
RPM_HASH = "55be1c671661570381332e736af2157b04da3811a328d1bb4b9e748c0be75ea5ec0964d89586a23c33a3768e559c97ae2a68043c39a1978a918f1e40a50e4617"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Spreadsheet::XLSX) \
perl(Spreadsheet::XLSX::Fmt2007) \
perl(Spreadsheet::XLSX::Utility2007) \
perl-Spreadsheet-XLSX"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Archive::Zip) \
perl(Spreadsheet::ParseExcel)"

inherit rpm
