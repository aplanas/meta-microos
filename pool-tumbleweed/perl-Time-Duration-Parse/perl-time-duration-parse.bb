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

RPM_NAME = "perl-Time-Duration-Parse-0.16-1.11.noarch.rpm"
RPM_HASH = "336b689ace98ffa60abf66984cb6c230116ac1b8aa01bdf77de4e8f06f3453ab1bd9123ed16dceab094c8d9301155c86827accd9496a3ffba4413a232a3c807c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Time--Duration--Parse \
perl-Time-Duration-Parse"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
