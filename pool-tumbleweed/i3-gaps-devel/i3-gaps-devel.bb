SUMMARY = "Development headers for i3-gaps"
DESCRIPTION = "Development headers for the i3-gaps window manager"
LICENSE = "BSD-3-Clause"

PV = "4.21.1"

RPM_NAME = "i3-gaps-devel-4.21.1-1.4.aarch64.rpm"
RPM_HASH = "baaab47ee87d55d389bf58b8ad80ce0823f0fbfa0349d1a5b6f41fc4d75a84b833a891ab4466f367a887fdfeee967b83e09a23865648f300e252140c430e8d0e"

RPROVIDES:${PN} += "i3-gaps-devel"

RDEPENDS:${PN} += "i3-gaps"

inherit rpm
