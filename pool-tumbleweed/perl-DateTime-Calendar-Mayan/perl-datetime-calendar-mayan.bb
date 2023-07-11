SUMMARY = "The Mayan Long Count, Haab, and Tzolkin calendars"
DESCRIPTION = "An implementation of the Mayan Long Count, Haab, and Tzolkin calendars as \
defined in 'Calendrical Calculations The Millennium Edition'. Supplemented by \
'Frequently Asked Questions about Calendars'. \
 \
Author: \
------- \
    Joshua Hoblitt <jhoblitt@cpan.org>"
LICENSE = "Artistic-1.0"

PV = "0.0601"

RPM_NAME = "perl-DateTime-Calendar-Mayan-0.0601-19.29.aarch64.rpm"
RPM_HASH = "08247e093658173704c73445f76225c66f73d6f0f40b39d61002b0d4ac252647c77b3a73ae355110be2321d6b3ebd4e7ece68f74d20ffc43727036ea951b7ef2"

RPROVIDES:${PN} += "perl-DateTime--Calendar--Mayan \
perl-DateTime-Calendar-Mayan"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-DateTime \
perl-Params--Validate"

inherit rpm
