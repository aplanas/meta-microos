SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "cross-arm-gcc13-icecream-backend-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "8e65a94907b7a3f6307085b8ad7f36ba3ed384d76ccd4c36f4a9de6aa6aa6c3f6915adeaf759451dd7bda8841db690858cf790cd2bf6b74b756e028eebe29f70"

RPROVIDES:${PN} += "cross-arm-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
