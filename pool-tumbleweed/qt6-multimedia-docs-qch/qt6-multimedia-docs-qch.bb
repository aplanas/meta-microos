SUMMARY = "Documentation for qt6-multimedia in QCH format"
DESCRIPTION = "This package contains documentation for qt6-multimedia in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-multimedia-docs-qch-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "e8498d3682e40e0d25173707142223e0a86254942f89c39d96a79fadfbcc974a2652c2849dac9fd97500cac6b2b1c8c94ef03e7d2396a5e4296d4eb4d0da7594"

RPROVIDES:${PN} += "qt6-multimedia-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
