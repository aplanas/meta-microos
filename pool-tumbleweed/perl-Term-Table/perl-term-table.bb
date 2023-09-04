SUMMARY = "Format a header and rows into a table"
DESCRIPTION = "This is used by some failing tests to provide diagnostics about what has \
gone wrong. This module is able to generic format rows of data into tables."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.016"

RPM_NAME = "perl-Term-Table-0.016-1.9.noarch.rpm"
RPM_HASH = "7b7c8d9903fa3571964007f2498b01e4385a135507e2a3eea0d2708ba73108964855e7f0116cfa1562bbf0875fb7820ff00905c9350c7c64c8ccc25e98cde1cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Term--Table \
perl-Term--Table--Cell \
perl-Term--Table--CellStack \
perl-Term--Table--HashBase \
perl-Term--Table--LineBreak \
perl-Term--Table--Spacer \
perl-Term--Table--Util \
perl-Term-Table"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Importer"

inherit rpm
