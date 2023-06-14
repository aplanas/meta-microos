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

RPM_NAME = "python310-pegasus-wms.api-5.0.3-1.3.noarch.rpm"
RPM_HASH = "5b80b6454edcdb9f03c021a53db3829d20526516e6e55435e5e3366630aa8a51073b40f84f383b2d1df20138d88a37484fe3ac4a9fc14104e8f99670d0cc94e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pegasus-wms.api \
python3.10dist-pegasus-wms.api \
python310-pegasus-wms.api \
python3dist-pegasus-wms.api"

RDEPENDS:${PN} += "python-abi \
python310-pegasus-wms.common"

inherit rpm
