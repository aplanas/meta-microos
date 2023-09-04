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

RPM_NAME = "perl-Spreadsheet-Read-0.87-1.3.noarch.rpm"
RPM_HASH = "3bc2610d48a27472710d1cc797bbc9bea3e48ffab26964dde042a5b3592e5f200e673f0503adfe4eb0063bf872d98712826c30b01a00928f04171480b57e8aeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Spreadsheet--Read \
perl-Spreadsheet--Read--Attribute \
perl-Spreadsheet--Read--Sheet \
perl-Spreadsheet-Read \
perl-Z10--Just--For--Testing \
perl-Z20--Just--For--Testing"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Data--Peek \
perl-File--Temp \
perl-IO--Scalar \
perl-Test--More \
perl-Test--NoWarnings"

inherit rpm
