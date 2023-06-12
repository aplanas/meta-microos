SUMMARY = "Development documentation for Qwt(Qt5)"
DESCRIPTION = "This package contains the development documentation of the Qwt(Qt5) widgets \
as is it created by doxygen."
LICENSE = "SUSE-QWT-1.0"

PV = "6.2.0"

RPM_NAME = "qwt6-qt5-devel-doc-6.2.0-2.1.noarch.rpm"
RPM_HASH = "7bfb29809a6642453e0f849c8cd7e0a464970765102ec9cd27b417e0e0405ba4513ae63f7a59e8334ab5cbef9a69f96c6d0351d3103f7f3645dea587628b96fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qwt6-qt5-devel-doc"
RDEPENDS:${PN} += "qwt6-qt5-devel"

inherit rpm
