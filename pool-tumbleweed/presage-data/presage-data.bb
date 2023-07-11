SUMMARY = "Intelligent predictive text entry platform (data files)"
DESCRIPTION = "Presage is an intelligent predictive text entry platform. \
 \
This package contains the sample statistical data files and abbreviation files needed by presage."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "presage-data-0.9.1-13.2.aarch64.rpm"
RPM_HASH = "335b21fcf0627aaa8cda50d3b413e00d8741d1e5ae21b4e7a5f3f204ea0aff30f19c4767d8d23dc78042a6af097a12bc092946b5a1e9e39da5a2f2c420f0a07a"

RPROVIDES:${PN} += "config-presage-data \
libpresage-data \
presage-data"

RDEPENDS:${PN} += ""

inherit rpm
