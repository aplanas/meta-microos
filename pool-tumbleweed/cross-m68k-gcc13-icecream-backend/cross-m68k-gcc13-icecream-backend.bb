SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "cross-m68k-gcc13-icecream-backend-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "9c0c507ba0bd225b260a6828efaa97a611f282d9e9eea062d121b0cfa1fe476828ab78024fe76e106ee8650b259702677523032bdc383a3b4f3c9cc9336905ac"

RPROVIDES:${PN} += "cross-m68k-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
