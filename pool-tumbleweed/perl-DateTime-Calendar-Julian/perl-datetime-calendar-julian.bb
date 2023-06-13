SUMMARY = "Dates in the Julian calendar"
DESCRIPTION = "DateTime::Calendar::Julian implements the Julian Calendar. This module \
implements all methods of DateTime; see the DateTime(3) manpage for all \
methods."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.107"

RPM_NAME = "perl-DateTime-Calendar-Julian-0.107-1.7.noarch.rpm"
RPM_HASH = "f29dd29f23e2bc7e9641f433a3c4657c25ae45f3ee5e14686403fb8da7376372b1f69451cbe63267dc922471d631dfbd1ab9514158919833ff2973d9116585dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(DateTime::Calendar::Julian) \
perl-DateTime-Calendar-Julian"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(DateTime)"

inherit rpm
