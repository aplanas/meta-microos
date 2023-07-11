SUMMARY = "Optimized module loading for forking or non-forking processes"
DESCRIPTION = "The 'prefork' pragma is intended to allow module writers to optimise module \
loading for *both* scenarios with as little additional code as possible. \
 \
prefork.pm is intended to serve as a central and optional marshalling point \
for state detection (are we running in compile-time or run-time mode) and \
to act as a relatively light-weight module loader."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.05"

RPM_NAME = "perl-prefork-1.05-1.16.noarch.rpm"
RPM_HASH = "ca5c9942e1d0b51796b36e29b5b0d0150c09aed664ddfb25606351acf4c2a240efbdf5dc41c9ea4249dd1273967318e1976fa42f92e5aea5997148a0540871f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-prefork"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
