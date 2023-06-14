SUMMARY = "Iconic font set"
DESCRIPTION = "Scalable vector icons that can be customized — size, color, drop shadow, \
and anything that can be done with the power of CSS. \
 \
(Note that the font does not contain regular letters, and that icons \
are in the range U+F000..U+F23A.)"
LICENSE = "OFL-1.1"

PV = "6.4.0"

RPM_NAME = "fontawesome-fonts-6.4.0-1.1.noarch.rpm"
RPM_HASH = "77a2e88018196e3468235319babdea0709919991e60f9b1b4042c141874fa517841bfc69efc2760eee48a7e60a1a021767b463615c9b8c4080f6a4d5f9035390"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fontawesome-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
