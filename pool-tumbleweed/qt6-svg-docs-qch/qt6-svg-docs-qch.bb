SUMMARY = "Documentation for qt6-svg in QCH format"
DESCRIPTION = "This package contains documentation for qt6-svg in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-svg-docs-qch-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "4acf9b1adce7d5267d61728edf8c487e98e12de91deebbe531af80d541b06e29ac56a43543093803c7a0f298cff41271e0e37150f78f0409a94edc177cc384fc"

RPROVIDES:${PN} += "qt6-svg-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
