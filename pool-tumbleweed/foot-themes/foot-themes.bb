SUMMARY = "Community-contributed themes for the foot terminal emulator"
DESCRIPTION = "This package contains popular themes for the foot terminal emulator providing \
users an easy way to theme foot."
LICENSE = "MIT"

PV = "1.15.3"

RPM_NAME = "foot-themes-1.15.3-1.1.noarch.rpm"
RPM_HASH = "b92561990e87a4394f880af74aa2de2315fdc2fd92b94b87d65a5407c2b2e58b9c9e77666b48f3d266bd229323108e55c1864510e9a8508cef8c079e0e9356ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "foot-themes"

RDEPENDS:${PN} += "foot"

inherit rpm
