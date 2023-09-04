SUMMARY = "Parse Xlsx Files"
DESCRIPTION = "This module is an adaptor for Spreadsheet::ParseExcel that reads XLSX \
files. For documentation about the various data that you can retrieve from \
these classes, please see Spreadsheet::ParseExcel, \
Spreadsheet::ParseExcel::Workbook, Spreadsheet::ParseExcel::Worksheet, and \
Spreadsheet::ParseExcel::Cell."
LICENSE = "MIT"

PV = "0.27"

RPM_NAME = "perl-Spreadsheet-ParseXLSX-0.27-1.17.noarch.rpm"
RPM_HASH = "f5a711e1c4999f36ef222424f1f176de7be33203b29381abb2fd6d0a8fb3bfab0ba3e78eb489491be2dc3941b7c3ead4836e469725afa528fb2eb2ebdf7220ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Spreadsheet--ParseXLSX \
perl-Spreadsheet--ParseXLSX--Decryptor \
perl-Spreadsheet--ParseXLSX--Decryptor--Agile \
perl-Spreadsheet--ParseXLSX--Decryptor--Standard \
perl-Spreadsheet-ParseXLSX"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Archive--Zip \
perl-Crypt--Mode--CBC \
perl-Crypt--Mode--ECB \
perl-Digest--SHA \
perl-Graphics--ColorUtils \
perl-OLE--Storage-Lite \
perl-Spreadsheet--ParseExcel \
perl-XML--Twig"

inherit rpm
