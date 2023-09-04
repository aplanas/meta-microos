SUMMARY = "Alias for __PACKAGE__"
DESCRIPTION = "CLASS and $CLASS are both synonyms for __PACKAGE__. Easier to type. \
 \
$CLASS has the additional benefit of working in strings."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.1.7"

RPM_NAME = "perl-CLASS-1.1.7-1.9.noarch.rpm"
RPM_HASH = "18211147a71e417723aaaaad4f36b64899ff35abf3fe2a2150268bba9f95dcf039c3f724757120d9ea7c924578cf31c2238f2e8bb18b67941349f9c578a07f04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CLASS"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
