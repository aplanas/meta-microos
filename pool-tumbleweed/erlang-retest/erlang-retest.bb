SUMMARY = "Erlang retest library"
DESCRIPTION = "Erlang retest library."
LICENSE = "MIT"

PV = "1.1.1+git20160312.ffef7d0"

RPM_NAME = "erlang-retest-1.1.1+git20160312.ffef7d0-1.26.aarch64.rpm"
RPM_HASH = "c96e93e7b61fdf869d480b5627a360011974ee492f9b86e79805405b790706782badf5178e4040db9208adcebdb55894cf93e26cc444f51966f042cb3c1826ba"

RPROVIDES:${PN} += "erlang-retest"

RDEPENDS:${PN} += "/usr/bin/env \
erlang"

inherit rpm
