SUMMARY = "Miscellaneous documentation for the X Window System"
DESCRIPTION = "This package provides miscellaneous documentation for the X Window \
System that doesn't better fit into other packages."
LICENSE = "MIT"

PV = "1.7.2"

RPM_NAME = "xorg-docs-1.7.2-1.6.noarch.rpm"
RPM_HASH = "da918ddf2c97393e1a1a58fe95416c77e7182bdc948f2256d41eeac8dc766e98fede23b2ae72a88c3744c9493107c59b9d1737a09a2d7d89606697cf2becdfdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xorg-docs \
xorg-x11-doc"

RDEPENDS:${PN} += ""

inherit rpm
