SUMMARY = "Color palette creation helper"
DESCRIPTION = "Read only color holding objects with no additional dependencies. Create \
them in many different ways (see section _CONSTRUCTOR_). Access its values \
via methods from section _GETTER_ or create related color objects via \
methods listed under _METHODS_. \
 \
Humans access colors on hardware level (eye) in RGB, on cognition level in \
HSL (brain) and on cultural level (language) with names. Having easy access \
to all three and some color math should enable you to get the color palette \
you desire quickly."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.08"

RPM_NAME = "perl-Graphics-Toolkit-Color-1.08-1.2.noarch.rpm"
RPM_HASH = "472c5fefe5a17510e7094f0ee7ebb0553d87d1dc16a2119c6422ca8fdd7ea6f6c7b465ba78edeb063dd6fb21b117aae214d22eb05af049cfef0356faf617bdb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Graphics--Toolkit--Color \
perl-Graphics--Toolkit--Color--Constant \
perl-Graphics--Toolkit--Color--Value \
perl-Graphics-Toolkit-Color"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Carp"

inherit rpm
