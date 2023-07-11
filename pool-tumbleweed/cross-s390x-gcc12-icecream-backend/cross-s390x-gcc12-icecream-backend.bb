SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-s390x-gcc12-icecream-backend-12.3.0+git1204-1.2.aarch64.rpm"
RPM_HASH = "1fa3dcd640d5f74a4fa58bacb3ac5cd7930250a8ac211e81d3b625570a357f4cd4f687d9248a59c9fa9801d6e78c8fca78b07c0c609fe19b6967b42bf8aaeede"

RPROVIDES:${PN} += "cross-s390x-gcc12-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
