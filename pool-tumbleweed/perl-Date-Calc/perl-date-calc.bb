SUMMARY = "Gregorian calendar date calculations"
DESCRIPTION = "* * \
 \
  'use Date::Calc qw( Days_in_Year Days_in_Month ... );' \
 \
* *"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "6.4"

RPM_NAME = "perl-Date-Calc-6.4-2.3.noarch.rpm"
RPM_HASH = "365f1f5f407e5ba68df1be8c7020911a0a4a1281640dfcf02773f54db7e7ed4fc969af62045b0d2938f99caad3c5728757766c6842535383fd432e5ebba8302d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Date--Calc \
perl-Date--Calc--Object \
perl-Date--Calc--PP \
perl-Date--Calendar \
perl-Date--Calendar--Profiles \
perl-Date--Calendar--Year \
perl-Date-Calc"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Bit--Vector \
perl-Carp--Clan"

inherit rpm
