SUMMARY = "Read information from an Excel file."
DESCRIPTION = "The Spreadsheet::ParseExcel module can be used to read information from \
Excel 95-2003 binary files. \
 \
The module cannot read files in the Excel 2007 Open XML XLSX format. See \
the the Spreadsheet::XLSX manpage module instead."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.65"

RPM_NAME = "perl-Spreadsheet-ParseExcel-0.65-3.27.noarch.rpm"
RPM_HASH = "9eeb761fc3a59907542e416e77c2a492f6d90e025580d421cb16b99c63e177f3fe95ab226052ffa387fe378edaf93ffbf8377c946268cb069e2535b9ae7640b3"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Crypt--RC4 \
perl-Digest--Perl--MD5 \
perl-IO--Scalar \
perl-OLE--Storage-Lite"

inherit rpm
