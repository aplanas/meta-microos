SUMMARY = "Holiday calculation library"
DESCRIPTION = "This package contains a library which helps developers determining when holidays occur."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kholidays-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "7c0ed86b0cffe8fe0d0cdf692d7ad040606f6b3998f70b886c1e2546494c3b1b18b5ed9a429a7a587408d977ccfb25f01c0df724628000092dc733646cb8b923"

RPROVIDES:${PN} += "kholidays"

RDEPENDS:${PN} += ""

inherit rpm
