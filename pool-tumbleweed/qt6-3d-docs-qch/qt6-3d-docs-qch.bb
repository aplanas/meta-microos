SUMMARY = "Documentation for qt6-3d in QCH format"
DESCRIPTION = "This package contains documentation for qt6-3d in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-3d-docs-qch-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "0dcfd68f9ad3154e299e73537a369c5044d99049aeae7d6a789ccba32360f3cea243a1f3db3b39bf3f26ce1d2a47fc1948e0de0a3ea4b3ec795e6165d00dab2c"

RPROVIDES:${PN} += "qt6-3d-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
