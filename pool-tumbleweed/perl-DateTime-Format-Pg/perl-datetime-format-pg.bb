SUMMARY = "Parse and format PostgreSQL dates and times"
DESCRIPTION = "This module understands the formats used by PostgreSQL for its DATE, TIME, \
TIMESTAMP, and INTERVAL data types. It can be used to parse these formats \
in order to create 'DateTime' or 'DateTime::Duration' objects, and it can \
take a 'DateTime' or 'DateTime::Duration' object and produce a string \
representing it in a format accepted by PostgreSQL."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.16014"

RPM_NAME = "perl-DateTime-Format-Pg-0.16014-1.12.noarch.rpm"
RPM_HASH = "99c93899ae7c1903174c14062ff85e8bf6b646949b9794d1a2984b603e1308602c42353b331c05985189c1d8f7f47013388d51ad5fb7174e125e09485ab6c142"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Format--Pg \
perl-DateTime-Format-Pg"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-DateTime \
perl-DateTime--Format--Builder \
perl-DateTime--TimeZone"

inherit rpm
