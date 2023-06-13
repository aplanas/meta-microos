SUMMARY = "Development Files for tdom"
DESCRIPTION = "This package contains files for developing software based on tdom."
LICENSE = "MPL-2.0"

PV = "0.9.2"

RPM_NAME = "tdom-devel-0.9.2-2.3.aarch64.rpm"
RPM_HASH = "38029e7dc7f0302e34c19dd86238fd8727d949ac044b42011279adf25974adc421535b873d811509cfe3e692da8a8e0517e31959a0554384077a34e9530e7102"

RPROVIDES:${PN} += "tdom-devel \
tdom-devel(aarch-64)"

RDEPENDS:${PN} += "tcl-devel \
tdom"

inherit rpm
