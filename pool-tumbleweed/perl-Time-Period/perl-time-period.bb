SUMMARY = "A Perl module to deal with time periods."
DESCRIPTION = "The *inPeriod* function determines if a given time falls within a given \
period. *inPeriod* returns *1* if the time does fall within the given \
period, *0* if not, and *-1* if *inPeriod* detects a malformed time or \
period."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.25"

RPM_NAME = "perl-Time-Period-1.25-1.27.noarch.rpm"
RPM_HASH = "c567f629b63adb7a408aee217c142528089c387682f92ef7155afd557e10d84ead06607b9d142a0d85ac4a1fb86134877cd4913c2d4139b2589005c0c0de761a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Time--Period \
perl-Time-Period"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
