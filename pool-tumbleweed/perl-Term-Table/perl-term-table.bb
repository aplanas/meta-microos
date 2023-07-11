SUMMARY = "Format a header and rows into a table"
DESCRIPTION = "This is used by some failing tests to provide diagnostics about what has \
gone wrong. This module is able to generic format rows of data into tables."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.016"

RPM_NAME = "perl-Term-Table-0.016-1.8.noarch.rpm"
RPM_HASH = "4c7d27184ecec2a0bf01fbed91bc0d976c77f6149f9fbe76ab19ede2ce1a89cb63e9ba0cc0684309f62b238270a716b46db213229a4621eaef0f6dd61820e358"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Term--Table \
perl-Term--Table--Cell \
perl-Term--Table--CellStack \
perl-Term--Table--HashBase \
perl-Term--Table--LineBreak \
perl-Term--Table--Spacer \
perl-Term--Table--Util \
perl-Term-Table"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Importer"

inherit rpm
