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

RPM_NAME = "perl-Graphics-Toolkit-Color-1.08-1.1.noarch.rpm"
RPM_HASH = "cdbc8b76df2f44fd2cf53222f37c914ab7e3c2c0606747ede7997b2ce39e1db31711e8c5f1fdea0d29821a01e12c6135438291ffdcd7d902f66a2c3e04bf3538"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Graphics::Toolkit::Color) \
perl(Graphics::Toolkit::Color::Constant) \
perl(Graphics::Toolkit::Color::Value) \
perl-Graphics-Toolkit-Color"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Carp)"

inherit rpm
