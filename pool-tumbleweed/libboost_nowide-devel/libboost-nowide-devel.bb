SUMMARY = "Development library for Boost.Nowide"
DESCRIPTION = "This package contains the Boost.Nowide development library. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.82.0"

RPM_NAME = "libboost_nowide-devel-1.82.0-1.1.noarch.rpm"
RPM_HASH = "b3ad999aff0947408d4a81111e79c4b40af05df18a4c532e39dabca18621c3758c45abea145d5d1d84025ec922ef0647318911fd96c734f979613a35f7e896ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libboost_nowide-devel"

RDEPENDS:${PN} += "libboost_nowide1_82_0-devel"

inherit rpm
