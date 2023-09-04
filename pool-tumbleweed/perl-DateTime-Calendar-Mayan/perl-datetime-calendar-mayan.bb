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

RPM_NAME = "perl-DateTime-Calendar-Mayan-0.0601-19.30.aarch64.rpm"
RPM_HASH = "f922597681ba3d00d971614604887ca27508f22cc057da9544eadd1e5fa3212c6641f71995d5e7b9e4bf02c63e8efc7888d8dcb6cce6d6ae6f3fe11e1048ef8a"

RPROVIDES:${PN} += "perl-DateTime--Calendar--Mayan \
perl-DateTime-Calendar-Mayan"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-DateTime \
perl-Params--Validate"

inherit rpm
