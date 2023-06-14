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

RPM_NAME = "python311-pegasus-wms.api-5.0.3-1.3.noarch.rpm"
RPM_HASH = "6903678698efe188cde76fa09fe03efb8169c057ea88c20127b603935f5daed06b64762d8d68eb30267c07ab5cbfa075df3ca73fbf07c4a68cb50f3f03a36170"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pegasus-wms.api \
python311-pegasus-wms.api \
python3dist-pegasus-wms.api"

RDEPENDS:${PN} += "python-abi \
python311-pegasus-wms.common"

inherit rpm
