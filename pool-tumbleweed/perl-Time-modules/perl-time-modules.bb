SUMMARY = "Various Perl time modules"
DESCRIPTION = "Perl modules providing various time functions."
LICENSE = "SUSE-Permissive"

PV = "2013.0912"

RPM_NAME = "perl-Time-modules-2013.0912-1.19.aarch64.rpm"
RPM_HASH = "62c2cb32e4601ebac2dadf41785baf19ba4f572e9ccd34e3a9f754734e8ed7226444ca2a54b12ea0568e6e1a99d0eae1c2d21d65be3d3af82c87c62e87a72325"

RPROVIDES:${PN} += "perl(Time::CTime) \
perl(Time::DaysInMonth) \
perl(Time::JulianDay) \
perl(Time::ParseDate) \
perl(Time::Timezone) \
perl-Time-modules \
perl-Time-modules(aarch-64)"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
