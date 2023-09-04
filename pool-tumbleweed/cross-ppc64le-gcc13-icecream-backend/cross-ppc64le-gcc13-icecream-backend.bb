SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-ppc64le-gcc13-icecream-backend-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "c6e208530220607ec4f68df882dac354b676c21131b1ab1abfcaac46cccf4223843f0db9b1e98b30f0e86e30ab17330f46e84f4fece1cf3eb39c3d75543b0080"

RPROVIDES:${PN} += "cross-ppc64le-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
