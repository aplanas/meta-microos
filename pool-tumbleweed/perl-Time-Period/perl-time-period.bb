SUMMARY = "A Perl module to deal with time periods."
DESCRIPTION = "The *inPeriod* function determines if a given time falls within a given \
period. *inPeriod* returns *1* if the time does fall within the given \
period, *0* if not, and *-1* if *inPeriod* detects a malformed time or \
period."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.25"

RPM_NAME = "perl-Time-Period-1.25-1.26.noarch.rpm"
RPM_HASH = "de150e571d9c3d2583ccaf1b17e45e0dab2c7948ce29796237851eeb7d2f5768ecba1538b0fbb72987ff870a02f1730d8be09d419669a5bce30f87fc1615fe33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Time--Period \
perl-Time-Period"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
