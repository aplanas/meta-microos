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

RPM_NAME = "python39-pegasus-wms.api-5.0.3-1.5.noarch.rpm"
RPM_HASH = "940be3cf75fcbfd0c2e71323fb3dc7f13ecdff3d6fa6e38b7f0d2f02c8cf0615c1c664d3ca732d56beaaa978d9a05df49b29e007e67bec75a1c55c5073f08c51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pegasus-wms.api \
python39-pegasus-wms.api \
python3dist-pegasus-wms.api"

RDEPENDS:${PN} += "python-abi \
python39-pegasus-wms.common"

inherit rpm
