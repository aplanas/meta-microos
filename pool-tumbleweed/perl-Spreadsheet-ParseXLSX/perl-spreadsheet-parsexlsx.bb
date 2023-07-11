SUMMARY = "Parse Xlsx Files"
DESCRIPTION = "This module is an adaptor for Spreadsheet::ParseExcel that reads XLSX \
files. For documentation about the various data that you can retrieve from \
these classes, please see Spreadsheet::ParseExcel, \
Spreadsheet::ParseExcel::Workbook, Spreadsheet::ParseExcel::Worksheet, and \
Spreadsheet::ParseExcel::Cell."
LICENSE = "MIT"

PV = "0.27"

RPM_NAME = "perl-Spreadsheet-ParseXLSX-0.27-1.16.noarch.rpm"
RPM_HASH = "6d7d73055e924724c89c2e32202eea840bab94b5e56c3b6b709c0a42f27965582198d210047cb099f6d7c4b989bbac25aa425cb96a8ef09fb3b59ee169436778"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Spreadsheet--ParseXLSX \
perl-Spreadsheet--ParseXLSX--Decryptor \
perl-Spreadsheet--ParseXLSX--Decryptor--Agile \
perl-Spreadsheet--ParseXLSX--Decryptor--Standard \
perl-Spreadsheet-ParseXLSX"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Archive--Zip \
perl-Crypt--Mode--CBC \
perl-Crypt--Mode--ECB \
perl-Digest--SHA \
perl-Graphics--ColorUtils \
perl-OLE--Storage-Lite \
perl-Spreadsheet--ParseExcel \
perl-XML--Twig"

inherit rpm
