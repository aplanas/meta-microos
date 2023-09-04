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

RPM_NAME = "perl-Symbol-Table-1.01-64.31.aarch64.rpm"
RPM_HASH = "840eba13914699d8f4be9465dd4c1c5e71a146d77538cf1a228fa8375125b13a7777935c4c050a8774fc272a651f08b9dc3b85ac7a615b408ce592b12e42285c"

RPROVIDES:${PN} += "perl-Symbol--Table \
perl-Symbol--Table--Tie \
perl-Symbol-Table"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
