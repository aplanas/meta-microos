SUMMARY = "Community-contributed themes for the foot terminal emulator"
DESCRIPTION = "This package contains popular themes for the foot terminal emulator providing \
users an easy way to theme foot."
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "foot-themes-1.14.0-4.1.noarch.rpm"
RPM_HASH = "53be1144878b949a07fb1477b2a8668c6d2ab4e017dfca8a70c48d4c603c219995ec7e9dc3df3d513330c58c61f3039e19366e7fb48371346297035756820263"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "foot-themes"

RDEPENDS:${PN} += "foot"

inherit rpm
