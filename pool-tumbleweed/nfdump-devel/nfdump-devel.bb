SUMMARY = "Development files for libnfdump"
DESCRIPTION = "This package contains libraries and header files for developing \
applications that use libnfdump."
LICENSE = "BSD-3-Clause"

PV = "1.7.1"

RPM_NAME = "nfdump-devel-1.7.1-1.4.aarch64.rpm"
RPM_HASH = "7775f07e1090db22a99c86f9e371a6a9857476093c0d503e64de062705f0e852c3151ca377e593ce60277bc1db31fab168c83dd4134b3f2ed95b2ceabf482a36"

RPROVIDES:${PN} += "nfdump-devel"

RDEPENDS:${PN} += "libnfdump1-7-1"

inherit rpm
