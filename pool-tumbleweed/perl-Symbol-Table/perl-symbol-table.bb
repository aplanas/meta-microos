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

RPM_NAME = "perl-Symbol-Table-1.01-64.30.aarch64.rpm"
RPM_HASH = "9b58fbca7024e594b30094bdf6db981f843b53b859f57142a5e9ff1e2f35504acd600c636ce144c57fb4b9ebf24c95284bf8dec9f5836e89bf091650c235fce4"

RPROVIDES:${PN} += "perl-Symbol--Table \
perl-Symbol--Table--Tie \
perl-Symbol-Table"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
