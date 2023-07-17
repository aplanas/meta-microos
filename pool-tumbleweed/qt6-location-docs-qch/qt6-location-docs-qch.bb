SUMMARY = "Documentation for qt6-location in QCH format"
DESCRIPTION = "This package contains documentation for qt6-location in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-location-docs-qch-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "8a972646107fe42fd853a72d213ba2b287257e1f0d839ae8d935e6a196493345441d6d465eda8ce1a0faa3120105683da6373ee4a37d5a11b18bd1340a030810"

RPROVIDES:${PN} += "qt6-location-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
