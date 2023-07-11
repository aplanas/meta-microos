SUMMARY = "Various Perl time modules"
DESCRIPTION = "Perl modules providing various time functions."
LICENSE = "SUSE-Permissive"

PV = "2013.0912"

RPM_NAME = "perl-Time-modules-2013.0912-1.20.aarch64.rpm"
RPM_HASH = "770d383c9df52e452e58caa037152479f8d3ebc8a83fc6a64d4f6061aef5bacff00e034594b6fe66f9f5a737df86581840c823c6a67d2bdba949a0355d1dee80"

RPROVIDES:${PN} += "perl-Time--CTime \
perl-Time--DaysInMonth \
perl-Time--JulianDay \
perl-Time--ParseDate \
perl-Time--Timezone \
perl-Time-modules"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
