SUMMARY = "Static development files for erfa"
DESCRIPTION = "This package contains libraries and header files for developing \
applications that link statically to erfa."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "erfa-devel-static-2.0.0-1.10.aarch64.rpm"
RPM_HASH = "d3e8c5d68658dc4216e6c71e19e3fc56ecf77d25c8edc39ed2dfb818c26dcca64779c3a7e8e15bd1a401039b3a1d9aae3a8ad19234e2eacc174ad57ef3669026"

RPROVIDES:${PN} += "erfa-devel-static erfa-devel-static(aarch-64)"
RDEPENDS:${PN} += "erfa-devel"

inherit rpm
