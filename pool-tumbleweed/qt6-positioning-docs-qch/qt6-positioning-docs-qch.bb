SUMMARY = "Documentation for qt6-positioning in QCH format"
DESCRIPTION = "This package contains documentation for qt6-positioning in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-positioning-docs-qch-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "cca989e937045409eedbc203ea943cbceef9b380c675e6c7de381bffc914eaf86dbab441963057cc75140edf42ede5d9dee19477c126bee4f729d9457b20e6be"

RPROVIDES:${PN} += "qt6-location-docs-qch \
qt6-positioning-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
