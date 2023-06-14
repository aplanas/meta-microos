SUMMARY = "Vala CMake modules"
DESCRIPTION = "This is a set of CMake modules: Translations, GSettings, and Vala \
modules."
LICENSE = "BSD-3-Clause"

PV = "3"

RPM_NAME = "vala-cmake-modules-3-1.10.aarch64.rpm"
RPM_HASH = "61c4970ef9f2411fe17cdaaf1902d8007e77d0176f4384322d860f099119001d478a32998a04052eb1b1a1c891303721ad415d2679faa018c602f9e2d8f13848"

RPROVIDES:${PN} += "vala-cmake-modules"

RDEPENDS:${PN} += ""

inherit rpm
