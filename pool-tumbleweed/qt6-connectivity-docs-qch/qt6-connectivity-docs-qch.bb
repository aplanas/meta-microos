SUMMARY = "Documentation for qt6-connectivity in QCH format"
DESCRIPTION = "This package contains documentation for qt6-connectivity in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-connectivity-docs-qch-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "1839c4bb040c173eed542d12f48968de2d818b9851dd23dceaff410a90234df5f6c9265e4c594487acca3ee20615de615af41ee09ed4f72c4c53fd1591e354ec"

RPROVIDES:${PN} += "qt6-connectivity-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
