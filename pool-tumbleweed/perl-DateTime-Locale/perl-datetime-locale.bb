SUMMARY = "Localization support for DateTime.pm"
DESCRIPTION = "DateTime::Locale is primarily a factory for the various locale subclasses. \
It also provides some functions for getting information on all the \
available locales. \
 \
If you want to know what methods are available for locale objects, then \
please read the DateTime::Locale::FromData documentation."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.390000"

RPM_NAME = "perl-DateTime-Locale-1.390000-1.3.noarch.rpm"
RPM_HASH = "23d5e6d69423d8438311d937d1b91773e6bb128afbbe3caa8a98f96e3a570f13991f8ec9e5e9a826c35e8c2bb23bb4a419607fa1835d04d1b79ac5c29041c5a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Locale \
perl-DateTime--Locale--Base \
perl-DateTime--Locale--Catalog \
perl-DateTime--Locale--Data \
perl-DateTime--Locale--FromData \
perl-DateTime--Locale--Util \
perl-DateTime-Locale"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Dist--CheckConflicts \
perl-File--ShareDir \
perl-List--Util \
perl-Params--ValidationCompiler \
perl-Specio--Declare \
perl-Specio--Library--String \
perl-namespace--autoclean"

inherit rpm
