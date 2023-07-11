SUMMARY = "Alternative Packages only for the DVD of openSUSE MicroOS"
DESCRIPTION = "Alternative additional packages on a openSUSE MicroOS DVD."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-alt_onlyDVD-5.0-72.1.aarch64.rpm"
RPM_HASH = "aba9da80af99546534aca6764da5bf31ea9839768f42d846d1b3b7ab8c1c5b1a6f57e5c6ceac9127ccf1ad31a5f3a8e1a70b2e69fb847e56ff44e888abf39f7e"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
patterns-microos-alt-onlyDVD"

RDEPENDS:${PN} += "kernel-default-base \
pattern-"

inherit rpm
