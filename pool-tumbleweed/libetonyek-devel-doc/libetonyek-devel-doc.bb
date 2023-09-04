SUMMARY = "Documentation for the libetonyek API"
DESCRIPTION = "This package contains documentation for the libetonyek API."
LICENSE = "MPL-2.0"

PV = "0.1.10"

RPM_NAME = "libetonyek-devel-doc-0.1.10-2.1.noarch.rpm"
RPM_HASH = "1536a645da957bd508cc6fa0b58ab18934c41b41cb38c94c2db29af8ed736ccdc53ae878d3eb46c255e801439f3730aba0b0ad90cb9d7346384743ed6a5d22de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libetonyek-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
