SUMMARY = "plasma5-integration development headers"
DESCRIPTION = "This package provides development headers for plasma5-integration. They \
are not meant to be used standalone, but are required for building other \
Plasma components."
LICENSE = "GPL-2.0+"

PV = "5.27.6"

RPM_NAME = "plasma5-integration-devel-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "9daca97a3fa8e391b5761610692b1360abd899aa365d1dfd4da0792e2404da7c8a5174cb6026b3c30c49941c0608015e9e1fd54899b119be394db409f876faf5"

RPROVIDES:${PN} += "pkgconfig-plasma-key-data \
plasma5-integration-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
plasma5-integration-plugin"

inherit rpm
