SUMMARY = "Localization support for DateTime.pm"
DESCRIPTION = "DateTime::Locale is primarily a factory for the various locale subclasses. \
It also provides some functions for getting information on all the \
available locales. \
 \
If you want to know what methods are available for locale objects, then \
please read the DateTime::Locale::FromData documentation."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.390000"

RPM_NAME = "perl-DateTime-Locale-1.390000-1.1.noarch.rpm"
RPM_HASH = "d67b072f740fe2774e92e9708c1e6b4a6b255d986d785b00b15906277ad250939c4b0807e4998e61fd668bd21ddc4dca3be6a8e7f819662a323dc2188e653290"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Locale \
perl-DateTime--Locale--Base \
perl-DateTime--Locale--Catalog \
perl-DateTime--Locale--Data \
perl-DateTime--Locale--FromData \
perl-DateTime--Locale--Util \
perl-DateTime-Locale"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Dist--CheckConflicts \
perl-File--ShareDir \
perl-List--Util \
perl-Params--ValidationCompiler \
perl-Specio--Declare \
perl-Specio--Library--String \
perl-namespace--autoclean"

inherit rpm
