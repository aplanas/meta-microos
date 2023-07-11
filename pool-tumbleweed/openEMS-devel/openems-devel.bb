SUMMARY = "openEMS development files"
DESCRIPTION = "This package contains libraries for developing applications \
that use openEMS."
LICENSE = "GPL-3.0-only"

PV = "0.0.35"

RPM_NAME = "openEMS-devel-0.0.35-5.37.aarch64.rpm"
RPM_HASH = "1d746a54f746ec1a05b49a54bd67a4f4644a67b62f7ffc83d2500cf687caf56b32a2a78a98f224ee469e87e0b929794c11ee4e57ffe7d323f3cc22499ebe6367"

RPROVIDES:${PN} += "openEMS-devel"

RDEPENDS:${PN} += "libnf2ff0 \
libopenEMS0"

inherit rpm
