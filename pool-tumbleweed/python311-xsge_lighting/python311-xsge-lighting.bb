SUMMARY = "xSGE Lighting Library"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides an interface for lighting."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "python311-xsge_lighting-1.0.2-1.8.noarch.rpm"
RPM_HASH = "18cfca1a9c8c3b806ca8599f046f14bafecc4e8d3ae1e81d46af3a6d4151439d8f4ab3e426b6a2a08dbda1c5c674ee9e0fbe67d37d55d3d330eb11d1b957fea6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xsge-lighting \
python3.11dist-xsge-lighting \
python311-xsge-lighting \
python3dist-xsge-lighting"

RDEPENDS:${PN} += "python-abi \
python311-sge-pygame \
python311-six"

inherit rpm
