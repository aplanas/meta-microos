SUMMARY = "Development files for krdc"
DESCRIPTION = "Development libraries and headers needed to build software using krdc"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "krdc-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "10917021df19b5e9a37fdf7b7aef207b342a3946c8c449f623e1a97c2e2c40f046ae1317bd76242a2d9f47e846f730d3d841ee6f9811c2db7e90504f06661546"

RPROVIDES:${PN} += "krdc-devel"

RDEPENDS:${PN} += "krdc"

inherit rpm
