SUMMARY = "Small dictionary for cracklib, a password checking library"
DESCRIPTION = "CrackLib tests passwords to determine whether they match certain \
security-oriented characteristics. You can use CrackLib to stop users \
from choosing passwords that are easy to guess. \
 \
This package contains a small dictionay file used by cracklib."
LICENSE = "LGPL-2.1-only"

PV = "2.9.11"

RPM_NAME = "cracklib-dict-small-2.9.11-1.1.aarch64.rpm"
RPM_HASH = "631280cbf51d86ff44a70f0a0b14741397f539cb9c39a001fa28d92274990b39880b384b17ef187e9859d4056960e200e7375418081fe7381afb4ef03b61f3ff"

RPROVIDES:${PN} += "cracklib-dict \
cracklib-dict-small"

RDEPENDS:${PN} += ""

inherit rpm
