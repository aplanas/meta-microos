SUMMARY = "Optimized module loading for forking or non-forking processes"
DESCRIPTION = "The 'prefork' pragma is intended to allow module writers to optimise module \
loading for *both* scenarios with as little additional code as possible. \
 \
prefork.pm is intended to serve as a central and optional marshalling point \
for state detection (are we running in compile-time or run-time mode) and \
to act as a relatively light-weight module loader."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.05"

RPM_NAME = "perl-prefork-1.05-1.15.noarch.rpm"
RPM_HASH = "4ecf76a969839c0810bf38563889b27a951061e16054a24f033692833423bf95d1504119e3dd3cd53ac7a46be5f916eb58c142f5c6bb0617d8f452e20526461c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-prefork"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
