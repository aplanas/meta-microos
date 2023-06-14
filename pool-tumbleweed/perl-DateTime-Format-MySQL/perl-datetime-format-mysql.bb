SUMMARY = "Parse and format MySQL dates and times"
DESCRIPTION = "This module understands the formats used by MySQL for its DATE, DATETIME, \
TIME, and TIMESTAMP data types. It can be used to parse these formats in \
order to create DateTime objects, and it can take a DateTime object and \
produce a string representing it in the MySQL format."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.0701"

RPM_NAME = "perl-DateTime-Format-MySQL-0.0701-1.9.noarch.rpm"
RPM_HASH = "4abe44995fc5445cf5e391c09b76bad368fa7051c70cf7e063b903a29adb9392af49d62bb91231a0c4a68ad90d4cec2be296014db836f7cec418302251bc47d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Format--MySQL \
perl-DateTime-Format-MySQL"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-DateTime \
perl-DateTime--Format--Builder"

inherit rpm
