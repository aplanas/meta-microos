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

RPM_NAME = "python310-pegasus-wms.api-5.0.3-1.5.noarch.rpm"
RPM_HASH = "26421c3d3b434e9f588bb3f2e01a64ba2d86cd298f0c549e77c5ec9a65b248af2a4cf89172eb204bb785be7a3e91ed5fa49f1f44687d82c9f22ad51e82b7cc25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pegasus-wms.api \
python310-pegasus-wms.api \
python3dist-pegasus-wms.api"

RDEPENDS:${PN} += "python-abi \
python310-pegasus-wms.common"

inherit rpm
