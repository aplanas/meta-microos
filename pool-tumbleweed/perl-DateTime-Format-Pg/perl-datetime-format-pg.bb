SUMMARY = "Parse and format PostgreSQL dates and times"
DESCRIPTION = "This module understands the formats used by PostgreSQL for its DATE, TIME, \
TIMESTAMP, and INTERVAL data types. It can be used to parse these formats \
in order to create 'DateTime' or 'DateTime::Duration' objects, and it can \
take a 'DateTime' or 'DateTime::Duration' object and produce a string \
representing it in a format accepted by PostgreSQL."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.16014"

RPM_NAME = "perl-DateTime-Format-Pg-0.16014-1.10.noarch.rpm"
RPM_HASH = "ca23523e248271021589457bd5bba75ffbad9d4f3c17d1940b36f920d6d8de4099dde79327508b11a6ecc30853abc960b6a6e5193f414c0b3a4b67cca7627acb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Format--Pg \
perl-DateTime-Format-Pg"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-DateTime \
perl-DateTime--Format--Builder \
perl-DateTime--TimeZone"

inherit rpm
