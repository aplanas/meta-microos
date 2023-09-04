SUMMARY = "Read information from an Excel file."
DESCRIPTION = "The Spreadsheet::ParseExcel module can be used to read information from \
Excel 95-2003 binary files. \
 \
The module cannot read files in the Excel 2007 Open XML XLSX format. See \
the the Spreadsheet::XLSX manpage module instead."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.65"

RPM_NAME = "perl-Spreadsheet-ParseExcel-0.65-3.28.noarch.rpm"
RPM_HASH = "c67cb4466f18c0558f9965839229b3bf902f24a35046cc290b0e3c9938d1036227022fb790ed196c397a6063e7f92e0a186a569eb4f01bdbd39901b2ff2ae5dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Spreadsheet--ParseExcel \
perl-Spreadsheet--ParseExcel--Cell \
perl-Spreadsheet--ParseExcel--Dump \
perl-Spreadsheet--ParseExcel--FmtDefault \
perl-Spreadsheet--ParseExcel--FmtJapan \
perl-Spreadsheet--ParseExcel--FmtJapan2 \
perl-Spreadsheet--ParseExcel--FmtUnicode \
perl-Spreadsheet--ParseExcel--Font \
perl-Spreadsheet--ParseExcel--Format \
perl-Spreadsheet--ParseExcel--SaveParser \
perl-Spreadsheet--ParseExcel--SaveParser--Workbook \
perl-Spreadsheet--ParseExcel--SaveParser--Worksheet \
perl-Spreadsheet--ParseExcel--Utility \
perl-Spreadsheet--ParseExcel--Workbook \
perl-Spreadsheet--ParseExcel--Worksheet \
perl-Spreadsheet-ParseExcel"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Crypt--RC4 \
perl-Digest--Perl--MD5 \
perl-IO--Scalar \
perl-OLE--Storage-Lite"

inherit rpm
