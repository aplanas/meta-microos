SUMMARY = "Development libraries for libblosc1"
DESCRIPTION = "This package provides development libraries and headers \
for libblosc1."
LICENSE = "MIT & BSD-3-Clause & BSD-2-Clause"

PV = "1.21.1"

RPM_NAME = "blosc-devel-1.21.1-1.10.aarch64.rpm"
RPM_HASH = "2dde0279578fefaee873b6d85416bb1c9264aee481114103e9c2c204a01ee880d74de9310a7f66bbb55a3a68ae426a4008a95843d86aa4b259f2af50dcfef0c3"

RPROVIDES:${PN} += "blosc-devel \
blosc-devel(aarch-64) \
pkgconfig(blosc)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libblosc1"

inherit rpm
