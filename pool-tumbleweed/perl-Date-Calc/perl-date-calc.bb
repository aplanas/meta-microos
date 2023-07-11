SUMMARY = "Gregorian calendar date calculations"
DESCRIPTION = "* * \
 \
  'use Date::Calc qw( Days_in_Year Days_in_Month ... );' \
 \
* *"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "6.4"

RPM_NAME = "perl-Date-Calc-6.4-2.2.noarch.rpm"
RPM_HASH = "4b83dd00c1ad77d879e5cb565aa336ef38c5f0f8ec3ca6d6796857ef9b8a58f780b4a7a8dc71acb0be3183bf5ee15ca35e071a275ae8ab3e59f17169e0290468"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Date--Calc \
perl-Date--Calc--Object \
perl-Date--Calc--PP \
perl-Date--Calendar \
perl-Date--Calendar--Profiles \
perl-Date--Calendar--Year \
perl-Date-Calc"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Bit--Vector \
perl-Carp--Clan"

inherit rpm
