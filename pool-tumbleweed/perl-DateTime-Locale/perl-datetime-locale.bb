SUMMARY = "Localization support for DateTime.pm"
DESCRIPTION = "DateTime::Locale is primarily a factory for the various locale subclasses. \
It also provides some functions for getting information on all the \
available locales. \
 \
If you want to know what methods are available for locale objects, then \
please read the DateTime::Locale::FromData documentation."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.390000"

RPM_NAME = "perl-DateTime-Locale-1.390000-1.2.noarch.rpm"
RPM_HASH = "9de5d6262de0b76cb200786d8136502c4271f10a8dd3afb790705ddc75b6d0ba22ca8fb08e1ca8414365f27e916b58ca063658900458cccf6644f13703def469"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Locale \
perl-DateTime--Locale--Base \
perl-DateTime--Locale--Catalog \
perl-DateTime--Locale--Data \
perl-DateTime--Locale--FromData \
perl-DateTime--Locale--Util \
perl-DateTime-Locale"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Dist--CheckConflicts \
perl-File--ShareDir \
perl-List--Util \
perl-Params--ValidationCompiler \
perl-Specio--Declare \
perl-Specio--Library--String \
perl-namespace--autoclean"

inherit rpm
