SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "cross-hppa-gcc13-icecream-backend-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "934f0b0adcc3f0a84100832c604f38dfd7c2292d00b81ae1049f8971234546153843fc73377b44d3f7d2d8503ce5630f2b3b86515c9f8259b0a676b945839b95"

RPROVIDES:${PN} += "cross-hppa-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
