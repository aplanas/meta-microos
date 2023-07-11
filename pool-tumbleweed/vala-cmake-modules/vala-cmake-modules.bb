SUMMARY = "Vala CMake modules"
DESCRIPTION = "This is a set of CMake modules: Translations, GSettings, and Vala \
modules."
LICENSE = "BSD-3-Clause"

PV = "3"

RPM_NAME = "vala-cmake-modules-3-1.11.aarch64.rpm"
RPM_HASH = "198b6bf03cb772d8fef4f3910fef8322f63b63cf5c8cc6378594130f04cdef13042076aa3e51f6debc26d2c83f8e01d32b5489680aaa35286dfd8d399b7c8c25"

RPROVIDES:${PN} += "vala-cmake-modules"

RDEPENDS:${PN} += ""

inherit rpm
