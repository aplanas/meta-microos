SUMMARY = "Documentation for qt6-base in QCH format"
DESCRIPTION = "This package contains documentation for qt6-base in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-base-docs-qch-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "630e947de443212267bb977a2045f09c2a3b404e69078b6140f0ea1c390da96106b6b2095d266bdaafb0733c58c4037d46660aee7d73ac991d658c4083ab3243"

RPROVIDES:${PN} += "qt6-base-docs-qch"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
