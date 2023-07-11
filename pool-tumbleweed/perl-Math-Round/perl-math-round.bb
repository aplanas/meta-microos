SUMMARY = "Perl extension for rounding numbers"
DESCRIPTION = "*Math::Round* supplies functions that will round numbers in different ways. \
The functions *round* and *nearest* are exported by default; others are \
available as described below. 'use ... qw(:all)' exports all functions."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.07"

RPM_NAME = "perl-Math-Round-0.07-1.27.noarch.rpm"
RPM_HASH = "b87e014435b4f611c4c875dcf3d49dcccb67d7913ff943c386074b7f71ce199eccedb935e90e49d870bf6c1b2232dc628fa9e58a5adc66fc7427490a9b6188fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Math--Round \
perl-Math-Round"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-AutoLoader"

inherit rpm
