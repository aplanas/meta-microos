SUMMARY = "Perl extension for rounding numbers"
DESCRIPTION = "*Math::Round* supplies functions that will round numbers in different ways. \
The functions *round* and *nearest* are exported by default; others are \
available as described below. 'use ... qw(:all)' exports all functions."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.07"

RPM_NAME = "perl-Math-Round-0.07-1.28.noarch.rpm"
RPM_HASH = "94c585f7334581cca764a163dd323bb37822e20b30aa19f3319fbfbc9de85f4c810481ccaf6bbe1765deacafe2061ae49c1572290a3433175463427f0da3635f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Math--Round \
perl-Math-Round"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-AutoLoader"

inherit rpm
