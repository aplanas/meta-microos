SUMMARY = "Optimized module loading for forking or non-forking processes"
DESCRIPTION = "The 'prefork' pragma is intended to allow module writers to optimise module \
loading for *both* scenarios with as little additional code as possible. \
 \
prefork.pm is intended to serve as a central and optional marshalling point \
for state detection (are we running in compile-time or run-time mode) and \
to act as a relatively light-weight module loader."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.05"

RPM_NAME = "perl-prefork-1.05-1.17.noarch.rpm"
RPM_HASH = "d3db1677efd98960844d6d23a9e97d4199df1c2f229e1874f4dc616f294f6e92043975fafb4b4375282dde965cec88d5854dc2846548a430e51b6afdf77d20d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-prefork"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
