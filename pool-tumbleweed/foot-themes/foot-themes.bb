SUMMARY = "Community-contributed themes for the foot terminal emulator"
DESCRIPTION = "This package contains popular themes for the foot terminal emulator providing \
users an easy way to theme foot."
LICENSE = "MIT"

PV = "1.15.2"

RPM_NAME = "foot-themes-1.15.2-1.1.noarch.rpm"
RPM_HASH = "d6e18e4c2948bb5003acf6ce16089fdca7f8db39067b571d9e2870ea7e8aa4f0c5037edda6002291660e58640c8fe0695a6d0bd8e52e324bfff0786d7c93e64f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "foot-themes"

RDEPENDS:${PN} += "foot"

inherit rpm
