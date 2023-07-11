SUMMARY = "Development files for libmount"
DESCRIPTION = "Files to develop applications using the libmount library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39"

RPM_NAME = "libmount-devel-static-2.39-1.1.aarch64.rpm"
RPM_HASH = "4abc08e2f35c686b1045708255778ccad8c24d378534e57d48361160ccefc1ad3e1d103a7e3b0f85da1a8268bbedbdce5346ffcf16b16ae2d8c4b8130e8e2af5"

RPROVIDES:${PN} += "libmount-devel-static"

RDEPENDS:${PN} += "libmount-devel"

inherit rpm
