SUMMARY = "Perl extension for reading MS Excel 2007 files;"
DESCRIPTION = "This module is a (quick and dirty) emulation of Spreadsheet::ParseExcel for \
Excel 2007 (.xlsx) file format. It supports styles and many of Excel's \
quirks, but not all. It populates the classes from Spreadsheet::ParseExcel \
for interoperability; including Workbook, Worksheet, and Cell."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.17"

RPM_NAME = "perl-Spreadsheet-XLSX-0.17-1.9.noarch.rpm"
RPM_HASH = "a97beb4564bb621d734e634b638ed7d5e8b87ba31cba7ad8453ee1661e19d023cbb3b4fecf8113a72e5e56121e953db4a98237b31bd5c35d8308c5d6b84af709"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Spreadsheet--XLSX \
perl-Spreadsheet--XLSX--Fmt2007 \
perl-Spreadsheet--XLSX--Utility2007 \
perl-Spreadsheet-XLSX"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Archive--Zip \
perl-Spreadsheet--ParseExcel"

inherit rpm
