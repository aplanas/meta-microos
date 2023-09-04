SUMMARY = "Determine Czech holidays"
DESCRIPTION = "This module exports a single function named *holidays()* which returns a \
list of Czech holidays in a given year."
LICENSE = "BSD-3-Clause"

PV = "0.20"

RPM_NAME = "perl-Date-Holidays-CZ-0.20-2.14.noarch.rpm"
RPM_HASH = "f51ee9a1981c48386431b5b39e0caec33ff65f9324100977a6b0b3e326831af5dc2bcb1037c407d7667e75d551fe01fceff3c637dcdd2c18c6f2576ef66b082c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Date--Holidays--CZ \
perl-Date-Holidays-CZ"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Date--Calc"

inherit rpm
