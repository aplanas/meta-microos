SUMMARY = "Pegasus Workflow Management System Python API"
DESCRIPTION = "This package contains the Python APIs for Pegasus WMS, including: \
 \
The DAX API (Versions 2 and 3) \
The PDAX API (Version 2) \
The monitoring API \
The Stampede database API \
The Pegasus statistics API \
The Pegasus plots API \
Misc. Pegasus utilities \
The pegasus service, including the ensemble manager and dashboard"
LICENSE = "Apache-2.0"

PV = "5.0.3"

RPM_NAME = "python311-pegasus-wms.api-5.0.3-1.5.noarch.rpm"
RPM_HASH = "c29da610ff376ace81044d25e3f4960b49f4267c3f3bd05e2a3b205b3e8bd1430053d876d113f9bdeec944258e64af17181dc6e2b5e05533116f183c343f0bce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pegasus-wms.api \
python3.11dist-pegasus-wms.api \
python311-pegasus-wms.api \
python3dist-pegasus-wms.api"

RDEPENDS:${PN} += "python-abi \
python311-pegasus-wms.common"

inherit rpm
