SUMMARY = "Documentation for GRASS GIS 7"
DESCRIPTION = "This package contains the HTML documentation files for GRASS GIS"
LICENSE = "GPL-2.0-or-later"

PV = "8.2.1"

RPM_NAME = "grass-doc-8.2.1-1.3.aarch64.rpm"
RPM_HASH = "11f71f9f7d3e268e3ee86eee3b8d933ee5c5e8e8c623a6e58b62e0b5e5a44ef082f0e53aaf71cd2424597255ede5ae5fbca94a73a6ce7a9dd695ca95f1d89ddd"

RPROVIDES:${PN} += "grass-doc \
grass-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
