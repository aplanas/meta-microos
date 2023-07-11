SUMMARY = "Parse and format PostgreSQL dates and times"
DESCRIPTION = "This module understands the formats used by PostgreSQL for its DATE, TIME, \
TIMESTAMP, and INTERVAL data types. It can be used to parse these formats \
in order to create 'DateTime' or 'DateTime::Duration' objects, and it can \
take a 'DateTime' or 'DateTime::Duration' object and produce a string \
representing it in a format accepted by PostgreSQL."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.16014"

RPM_NAME = "perl-DateTime-Format-Pg-0.16014-1.11.noarch.rpm"
RPM_HASH = "3cc549dc1b2cbdae1e7e25142cbaefbeb0e45ff06816cef2e2a1622457285e76ad766a3a2736fe16984f1944febc3b59d6b895a1e0c8f88621cb9edb5acd1faa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Format--Pg \
perl-DateTime-Format-Pg"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-DateTime \
perl-DateTime--Format--Builder \
perl-DateTime--TimeZone"

inherit rpm
