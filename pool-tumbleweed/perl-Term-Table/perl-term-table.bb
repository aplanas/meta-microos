SUMMARY = "Format a header and rows into a table"
DESCRIPTION = "This is used by some failing tests to provide diagnostics about what has \
gone wrong. This module is able to generic format rows of data into tables."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.016"

RPM_NAME = "perl-Term-Table-0.016-1.7.noarch.rpm"
RPM_HASH = "7d426b5952000a9a847fff42794bf99c1f086f24eaf32ab9cd4fdabb1085b2b5c6f7198bc63d666d90d8263c9287ea019aafcb5be9c4e785bb3b842f3bdc4bc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Term::Table) \
perl(Term::Table::Cell) \
perl(Term::Table::CellStack) \
perl(Term::Table::HashBase) \
perl(Term::Table::LineBreak) \
perl(Term::Table::Spacer) \
perl(Term::Table::Util) \
perl-Term-Table"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Importer)"

inherit rpm
