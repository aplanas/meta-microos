SUMMARY = "An easy interface to symbol tables"
DESCRIPTION = "Symbol::Table allows the user to manipulate Perl's symbol table \
 \
 \
 \
Authors: \
-------- \
    Greg London"
LICENSE = "Artistic-1.0"

PV = "1.01"

RPM_NAME = "perl-Symbol-Table-1.01-64.29.aarch64.rpm"
RPM_HASH = "0602b6902e9af97df1e28fb0f77bc9178e0490a272b9a8a299a322248ae042b8646e38f2d32cb4702ae89086c13637d4496c84a4f1d5109443444e921ae6153f"

RPROVIDES:${PN} += "perl(Symbol::Table) \
perl(Symbol::Table::Tie) \
perl-Symbol-Table \
perl-Symbol-Table(aarch-64)"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
