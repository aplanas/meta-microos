SUMMARY = "Development documentation for Qwt(Qt6)"
DESCRIPTION = "This package contains the development documentation of the Qwt(Qt6) widgets \
as is it created by doxygen."
LICENSE = "SUSE-QWT-1.0"

PV = "6.2.0"

RPM_NAME = "qwt6-qt6-devel-doc-6.2.0-2.2.noarch.rpm"
RPM_HASH = "d1a6c6011a9724e0ea4f7ead7d45145d72dcb29bc9cc2354b190aef36721a6761032eb980de8d49eef5302e63a373782dc3114f6b4272f40f6695d49bdec715d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qwt6-qt6-devel-doc"

RDEPENDS:${PN} += "qwt6-qt6-devel"

inherit rpm
