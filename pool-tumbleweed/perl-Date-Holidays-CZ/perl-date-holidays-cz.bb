SUMMARY = "Determine Czech holidays"
DESCRIPTION = "This module exports a single function named *holidays()* which returns a \
list of Czech holidays in a given year."
LICENSE = "BSD-3-Clause"

PV = "0.20"

RPM_NAME = "perl-Date-Holidays-CZ-0.20-2.13.noarch.rpm"
RPM_HASH = "a54e8e1bed7eada013ce561c75ef4ecf217a4c08801265f168bc62fc71f042b84de6d3e360ad0bf4342493f28ce9e0673a4b2243ada04023007f6ab23607d8f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Date--Holidays--CZ \
perl-Date-Holidays-CZ"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Date--Calc"

inherit rpm
