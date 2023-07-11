SUMMARY = "SUSE Linux Base Package (malloc checking)"
DESCRIPTION = "This package sets environment variables that enable stricter \
malloc checks to catch potential heap corruptions. It's not \
installed by default as it may degrade performance."
LICENSE = "GPL-2.0-or-later"

PV = "84.87+git20230329.b39efbc"

RPM_NAME = "aaa_base-malloccheck-84.87+git20230329.b39efbc-1.2.aarch64.rpm"
RPM_HASH = "3f9e7335d52829590a992de7c554a525e49dfcf788c54282523c05934bad13bdaf1e083431419271834556a9e21375dee2bb1f74ee6d80b913ea37f64c1920f9"

RPROVIDES:${PN} += "aaa-base-malloccheck"

RDEPENDS:${PN} += "aaa-base"

inherit rpm
