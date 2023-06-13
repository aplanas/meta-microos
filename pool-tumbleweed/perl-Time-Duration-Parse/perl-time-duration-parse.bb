SUMMARY = "Parse string that represents time duration"
DESCRIPTION = "Time::Duration::Parse is a module to parse human readable duration strings \
like _2 minutes and 3 seconds_ to seconds. \
 \
It does the opposite of Time::Duration/duration_exact function in \
Time::Duration and is roundtrip safe. So, the following is always true. \
 \
  use Time::Duration::Parse; \
  use Time::Duration; \
 \
  my $seconds = int rand 100000; \
  is( parse_duration(duration_exact($seconds)), $seconds );"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.16"

RPM_NAME = "perl-Time-Duration-Parse-0.16-1.9.noarch.rpm"
RPM_HASH = "be417b421c167ae851f71f3046847c642940b13c37ed7bc3c73d69f56c99970f6cf443e5861629c716116b71ae21594d892b27013914d82834a9951673fe3559"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Time::Duration::Parse) \
perl-Time-Duration-Parse"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
