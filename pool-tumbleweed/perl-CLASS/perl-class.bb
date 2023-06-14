SUMMARY = "Alias for __PACKAGE__"
DESCRIPTION = "CLASS and $CLASS are both synonyms for __PACKAGE__. Easier to type. \
 \
$CLASS has the additional benefit of working in strings."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.1.7"

RPM_NAME = "perl-CLASS-1.1.7-1.7.noarch.rpm"
RPM_HASH = "4ae1a5ee9b1998478b5e09a46d30f5cad1ead272900265317fed95da18d1ae9c055df068c183ae62011c4d03f95ddef5c036d5a087b1c820f278ef2f421362c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CLASS"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
