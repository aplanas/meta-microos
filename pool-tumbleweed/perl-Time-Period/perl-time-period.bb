SUMMARY = "A Perl module to deal with time periods."
DESCRIPTION = "The *inPeriod* function determines if a given time falls within a given \
period. *inPeriod* returns *1* if the time does fall within the given \
period, *0* if not, and *-1* if *inPeriod* detects a malformed time or \
period."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.25"

RPM_NAME = "perl-Time-Period-1.25-1.28.noarch.rpm"
RPM_HASH = "a829942beeaddb54938ff3f4ce6fe46d359590477e0b52488000db517d31e0544ad44eada9117d3b31615cfb0bcf9ce0e749cddb329d702dea2584cd45967efa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Time--Period \
perl-Time-Period"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
