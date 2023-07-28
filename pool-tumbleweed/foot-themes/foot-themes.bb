SUMMARY = "Community-contributed themes for the foot terminal emulator"
DESCRIPTION = "This package contains popular themes for the foot terminal emulator providing \
users an easy way to theme foot."
LICENSE = "MIT"

PV = "1.15.0"

RPM_NAME = "foot-themes-1.15.0-1.1.noarch.rpm"
RPM_HASH = "4a54a7f10e84a007b35baf780deec3e7702de5ee0e755f446865b5cb6e0823d93252f8bcac119423ad82e8710e70f3029dd46fe936480b455fbc2f555134bd9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "foot-themes"

RDEPENDS:${PN} += "foot"

inherit rpm
