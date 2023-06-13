SUMMARY = "Development files for embree"
DESCRIPTION = "This package contains the C++ header and CMake config files."
LICENSE = "Apache-2.0"

PV = "3.13.5"

RPM_NAME = "embree-devel-3.13.5-2.3.aarch64.rpm"
RPM_HASH = "8465488e79bf2f04dbc31e10024300a31984d9519be71df05279e009c5f6e4d75b581e64ecd431af127847b7ed7d4e20afedfcd1f1956f75fc85622f0d55694a"

RPROVIDES:${PN} += "cmake(embree) \
embree-devel \
embree-devel(aarch-64)"

RDEPENDS:${PN} += "libembree3"

inherit rpm
