SUMMARY = "Copic Colors for The Gimp Palettes"
DESCRIPTION = "An original set of vector icons designed specifically for Elementary \
OS and its desktop environment, Pantheon. \
 \
This package contains a palette file for the GIMP."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.0"

RPM_NAME = "elementary-icon-theme-gimp-palette-5.1.0-1.10.noarch.rpm"
RPM_HASH = "03a1248bf41afdddd4e79c0dce035a4373e7e795f8e9410eb782fff08e75af131c0884d5462c539a231ff153a56e6174334ec5b0977a562d60b75c98bfc527e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "elementary-icon-theme-gimp-palette"
RDEPENDS:${PN} += "elementary-icon-theme gimp"

inherit rpm
