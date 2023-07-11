SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-s390x-gcc13-icecream-backend-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "680de802030d5a56a626852696bf576292d2c7fe71700771c160015253103d3388a7a1c1beaa1a4319a3f36acfbdda620ade5f24f1fbe0e88b960f3d554d10df"

RPROVIDES:${PN} += "cross-s390x-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
