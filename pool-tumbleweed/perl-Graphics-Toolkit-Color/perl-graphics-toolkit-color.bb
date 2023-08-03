SUMMARY = "Color palette creation helper"
DESCRIPTION = "Read only color holding objects with no additional dependencies. Create \
them in many different ways (see section _CONSTRUCTOR_). Access its values \
via methods from section _GETTER_ or measure differences and create related \
color objects via methods listed under _METHODS_. \
 \
Humans access colors on hardware level (eye) in RGB, on cognition level in \
HSL (brain) and on cultural level (language) with names. Having easy access \
to all three and some color math should enable you to get the color palette \
you desire quickly."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.90.0"

RPM_NAME = "perl-Graphics-Toolkit-Color-1.90.0-1.1.noarch.rpm"
RPM_HASH = "6b5b57757e544ce8f684abd622fad82fae5f6a8b7eab51a878583d8a55bd27587c220bd9ba69d26c486ff2d5243f73c1477250d8db4338d47f68d828306a3f20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Graphics--Toolkit--Color \
perl-Graphics--Toolkit--Color--Constant \
perl-Graphics--Toolkit--Color--Value \
perl-Graphics--Toolkit--Color--Value--HSL \
perl-Graphics--Toolkit--Color--Value--RGB \
perl-Graphics--Toolkit--Color--Value--Util \
perl-Graphics-Toolkit-Color"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Carp"

inherit rpm
