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

RPM_NAME = "perl-Time-Duration-Parse-0.16-1.10.noarch.rpm"
RPM_HASH = "9662d1850132b8a4d74346e23ad3722266b23ff3277aa910f702d7b9de9141eff903f7990288a1123f84cbe626be245b806bb347d3505dfe2936b93354774cdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Time--Duration--Parse \
perl-Time-Duration-Parse"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
