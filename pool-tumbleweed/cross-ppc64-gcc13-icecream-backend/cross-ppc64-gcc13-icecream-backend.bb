SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-ppc64-gcc13-icecream-backend-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "f0f917856385487257cae08ef143f1c05fe03d0281cfbc4c4f796759945fad2100d8709eb68dc03745b435e56c84c3bbe7e976623fe2f346b608daacd7b39e3f"

RPROVIDES:${PN} += "cross-ppc64-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
