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

RPM_NAME = "python39-pegasus-wms.api-5.0.3-1.3.noarch.rpm"
RPM_HASH = "b6f1457c934883b599ed70a3763f3b3f464ef47bce59b66a9ff6e7a698eff7eb2500cd987d4e32fa81dda9fab898db88a63f44e874a53ed3c0648c49eff9bf29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pegasus-wms.api) \
python39-pegasus-wms.api \
python3dist(pegasus-wms.api)"

RDEPENDS:${PN} += "python(abi) \
python39-pegasus-wms.common"

inherit rpm
