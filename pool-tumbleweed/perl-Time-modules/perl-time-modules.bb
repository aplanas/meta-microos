SUMMARY = "Various Perl time modules"
DESCRIPTION = "Perl modules providing various time functions."
LICENSE = "SUSE-Permissive"

PV = "2013.0912"

RPM_NAME = "perl-Time-modules-2013.0912-1.21.aarch64.rpm"
RPM_HASH = "3776dce44a0fcbe48824f0d96ed44ab24ed84cfad8b6d08433db399e6cdea3232a9242318952fb3882d79515ff476a620357156de3fa81611378219bd68b8417"

RPROVIDES:${PN} += "perl-Time--CTime \
perl-Time--DaysInMonth \
perl-Time--JulianDay \
perl-Time--ParseDate \
perl-Time--Timezone \
perl-Time-modules"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
