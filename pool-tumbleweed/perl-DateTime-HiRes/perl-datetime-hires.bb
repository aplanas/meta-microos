SUMMARY = "Create DateTime objects with sub-second current time resolution"
DESCRIPTION = "This module enables you to generate DateTime objects that represent the \
current time with sub-second resolution."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.04"

RPM_NAME = "perl-DateTime-HiRes-0.04-1.3.noarch.rpm"
RPM_HASH = "94fcffb17bb0fca292ccda9ce134199ceb2ff6a71fc8b5e61f8cbe6ea62c719c1ac7cd4b05507452e22e666483eefb5633b611acdd3f44ac0d177ed46d1400b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--HiRes \
perl-DateTime-HiRes"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-DateTime"

inherit rpm
