SUMMARY = "Parse and format MySQL dates and times"
DESCRIPTION = "This module understands the formats used by MySQL for its DATE, DATETIME, \
TIME, and TIMESTAMP data types. It can be used to parse these formats in \
order to create DateTime objects, and it can take a DateTime object and \
produce a string representing it in the MySQL format."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.0800"

RPM_NAME = "perl-DateTime-Format-MySQL-0.0800-1.1.noarch.rpm"
RPM_HASH = "ba9ad0f8f8c213316b837d9b5487e36abd391d28830a584b3c92d6108fcc39890457f66ec0ca425740f410ecc85ad79aedc7536fc216701516b1d8706286389d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Format--MySQL \
perl-DateTime-Format-MySQL"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-DateTime \
perl-DateTime--Format--Builder"

inherit rpm
