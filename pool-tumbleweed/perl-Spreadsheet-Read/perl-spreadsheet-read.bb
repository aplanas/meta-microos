SUMMARY = "Meta-Wrapper for reading spreadsheet data"
DESCRIPTION = "Spreadsheet::Read tries to transparently read *any* spreadsheet and return \
its content in a universal manner independent of the parsing module that \
does the actual spreadsheet scanning. \
 \
For OpenOffice this module uses Spreadsheet::ReadSXC \
 \
For Microsoft Excel this module uses Spreadsheet::ParseExcel or \
Spreadsheet::XLSX \
 \
For CSV this module uses Text::CSV_XS (0.29 or up required, 0.73 or up \
preferred) or Text::CSV_PP (1.05 or up required). \
 \
For SquirrelCalc there is a very simplistic built-in parser"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.87"

RPM_NAME = "perl-Spreadsheet-Read-0.87-1.2.noarch.rpm"
RPM_HASH = "2f98e92d17a53b467427eaed6b0612399c19dcd0ea1232b5a4a4b99b47e18e94bff81c0a865aa85dbe10be0a36f9e720e8e3699551158ee7246d7941ed433a1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Spreadsheet--Read \
perl-Spreadsheet--Read--Attribute \
perl-Spreadsheet--Read--Sheet \
perl-Spreadsheet-Read \
perl-Z10--Just--For--Testing \
perl-Z20--Just--For--Testing"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Data--Peek \
perl-File--Temp \
perl-IO--Scalar \
perl-Test--More \
perl-Test--NoWarnings"

inherit rpm
