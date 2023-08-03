SUMMARY = "Documentation for qt6-positioning in QCH format"
DESCRIPTION = "This package contains documentation for qt6-positioning in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-positioning-docs-qch-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "a621c32e18d5f12bbccc880081efa2f2acec41cd34c88b103f7c68d1cfe02294e9e729069f677af8e1a20709a4372acdbd0ceeae1836b2dedd824d83b5b1b5f4"

RPROVIDES:${PN} += "qt6-location-docs-qch \
qt6-positioning-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
