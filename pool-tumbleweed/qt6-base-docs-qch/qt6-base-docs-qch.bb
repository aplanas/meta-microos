SUMMARY = "Documentation for qt6-base in QCH format"
DESCRIPTION = "This package contains documentation for qt6-base in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-base-docs-qch-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "12ddea1a6ab30478d6252132f99f901dc789e38dc2ad1d385209bc33eecbbb6f3152674e1d6ef51af42094c53165379f6d0a81828a916509c7a06be61dd5e982"

RPROVIDES:${PN} += "qt6-base-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
