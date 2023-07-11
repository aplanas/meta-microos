SUMMARY = "Parse and format MySQL dates and times"
DESCRIPTION = "This module understands the formats used by MySQL for its DATE, DATETIME, \
TIME, and TIMESTAMP data types. It can be used to parse these formats in \
order to create DateTime objects, and it can take a DateTime object and \
produce a string representing it in the MySQL format."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.0701"

RPM_NAME = "perl-DateTime-Format-MySQL-0.0701-1.10.noarch.rpm"
RPM_HASH = "6deafacc193414c27f55eb1033f5e9fa05a2f0fce6e77204fe67b85e1a3e22985897d18f6cad974fbe98f80af9896794f4765ece3267b867b35194b08400da9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Format--MySQL \
perl-DateTime-Format-MySQL"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-DateTime \
perl-DateTime--Format--Builder"

inherit rpm
