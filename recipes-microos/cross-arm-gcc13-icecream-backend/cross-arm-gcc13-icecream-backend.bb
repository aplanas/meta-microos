SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "cross-arm-gcc13-icecream-backend-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "5edf8fbe3eb3085e3d3549f1b80a27754382d7beb55b8d491c4abc559f510b8d4696f6b1949e7c6d96c23e4613db91062ddf917c65dc94779e73663a8e58e3f5"

RPROVIDES:${PN} += "cross-arm-gcc13-icecream-backend cross-arm-gcc13-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
