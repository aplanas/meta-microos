SUMMARY = "Scripts to Work with Spreadsheets"
DESCRIPTION = "This package includes some scripts to work with spreadsheets."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.87"

RPM_NAME = "perl-Spreadsheet-Read-scripts-0.87-1.3.noarch.rpm"
RPM_HASH = "b1fc1d7fb366a988c3f89b6bda404c410fcac423516f1a8bbbadd13436d00f530c1b5907c8bef45c24ea28ad3b241ef24ff76cec53e1caf85db256aff1fda0bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Spreadsheet-Read-scripts"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-HTML--Entities \
perl-Spreadsheet--Read \
perl-Term--ReadKey \
perl-Text--CSV-XS \
perl-Tk \
perl-Tk--TableMatrix--Spreadsheet"

inherit rpm
