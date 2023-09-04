SUMMARY = "Color palette creation helper"
DESCRIPTION = "ATTENTION: deprecated methods of the old API will be removed on version \
2.0. \
 \
Graphics::Toolkit::Color, for short GTC, is the top level API of this \
module. It is designed to get a fast access to a set of related colors, \
that serve your need. While it can understand and output many color \
formats, its primary (internal) format is RGB, because this it is about \
colors that can be shown on the screen. \
 \
Humans access colors on hardware level (eye) in RGB, on cognition level in \
HSL (brain) and on cultural level (language) with names. Having easy access \
to all three and some color math should enable you to get the color palette \
you desire quickly. \
 \
GTC are read only color holding objects with no additional dependencies. \
Create them in many different ways (see section _CONSTRUCTOR_). Access its \
values via methods from section _GETTER_ or measure differences and create \
related color objects via methods listed under _METHODS_."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.530.0"

RPM_NAME = "perl-Graphics-Toolkit-Color-1.530.0-1.1.noarch.rpm"
RPM_HASH = "79872df256597b2334060786b41d7ebbc5c37c271df06b9e6a355e2ff728da4c94339ee9ee96e38de749522b4eae9b82d5c2d5306d50ef2ba3a9d68f3a2ce3d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Graphics--Toolkit--Color \
perl-Graphics--Toolkit--Color--Constant \
perl-Graphics--Toolkit--Color--Space \
perl-Graphics--Toolkit--Color--SpaceBasis \
perl-Graphics--Toolkit--Color--Util \
perl-Graphics--Toolkit--Color--Value \
perl-Graphics--Toolkit--Color--Value--CMY \
perl-Graphics--Toolkit--Color--Value--CMYK \
perl-Graphics--Toolkit--Color--Value--HSL \
perl-Graphics--Toolkit--Color--Value--HSV \
perl-Graphics--Toolkit--Color--Value--RGB \
perl-Graphics-Toolkit-Color"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Carp"

inherit rpm
