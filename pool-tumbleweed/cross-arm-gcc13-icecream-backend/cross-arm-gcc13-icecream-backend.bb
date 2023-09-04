SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-arm-gcc13-icecream-backend-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "03fd138a43ce3c2fdee73720608dcf5e9756808c9df154eb789ba6ee0b52678475e485de2bca977f5b61ef84b032dd0c04bd9ea52c37cdad730681ddb99f6f47"

RPROVIDES:${PN} += "cross-arm-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
