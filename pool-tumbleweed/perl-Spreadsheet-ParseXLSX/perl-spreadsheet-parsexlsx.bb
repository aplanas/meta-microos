SUMMARY = "Parse Xlsx Files"
DESCRIPTION = "This module is an adaptor for Spreadsheet::ParseExcel that reads XLSX \
files. For documentation about the various data that you can retrieve from \
these classes, please see Spreadsheet::ParseExcel, \
Spreadsheet::ParseExcel::Workbook, Spreadsheet::ParseExcel::Worksheet, and \
Spreadsheet::ParseExcel::Cell."
LICENSE = "MIT"

PV = "0.27"

RPM_NAME = "perl-Spreadsheet-ParseXLSX-0.27-1.15.noarch.rpm"
RPM_HASH = "3b3250b1e8746296f6b68120a8a4d4fd94838e693c227b3eced5fcda939cf79adaaf4f0e47da348edd0a75d1b135caed9ad40b0b4bd7acb50c7a634511e1f45b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Spreadsheet::ParseXLSX) \
perl(Spreadsheet::ParseXLSX::Decryptor) \
perl(Spreadsheet::ParseXLSX::Decryptor::Agile) \
perl(Spreadsheet::ParseXLSX::Decryptor::Standard) \
perl-Spreadsheet-ParseXLSX"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Archive::Zip) \
perl(Crypt::Mode::CBC) \
perl(Crypt::Mode::ECB) \
perl(Digest::SHA) \
perl(Graphics::ColorUtils) \
perl(OLE::Storage_Lite) \
perl(Spreadsheet::ParseExcel) \
perl(XML::Twig)"

inherit rpm
