SUMMARY = "Community-contributed themes for the foot terminal emulator"
DESCRIPTION = "This package contains popular themes for the foot terminal emulator providing \
users an easy way to theme foot."
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "foot-themes-1.14.0-2.1.noarch.rpm"
RPM_HASH = "b977047866bb6d4e1a9c92eaebe23b322d4a9a0eb967f214f79e30d2ddb504d00aaeb7a5d90c003958e71270d8bc53718b3c638b39c68eecd0a97446a81022ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "foot-themes"

RDEPENDS:${PN} += "foot"

inherit rpm
