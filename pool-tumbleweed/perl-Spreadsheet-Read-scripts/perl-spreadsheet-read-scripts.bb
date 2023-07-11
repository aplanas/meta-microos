SUMMARY = "Scripts to Work with Spreadsheets"
DESCRIPTION = "This package includes some scripts to work with spreadsheets."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.87"

RPM_NAME = "perl-Spreadsheet-Read-scripts-0.87-1.2.noarch.rpm"
RPM_HASH = "aa4be372194b589c0eb82f79ea5a6b9b28af4ab35ebf60ab9ee0b54e1c73f7f5eff5c38e38bba45ba4fb3716ecb5dd18d3d0c823555387650d3853ebf65a59ac"
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
