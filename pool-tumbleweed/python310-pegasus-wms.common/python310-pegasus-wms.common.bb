SUMMARY = "Pegasus Workflow Management System Python Commons"
DESCRIPTION = "This package contains common files for the Python APIs for Pegasus WMS."
LICENSE = "Apache-2.0"

PV = "5.0.3"

RPM_NAME = "python310-pegasus-wms.common-5.0.3-2.5.noarch.rpm"
RPM_HASH = "1de4618e7e618fcb06cd76b15ea7723836eacfad060a9d02c734520d4a07bc71e16a1f53f2e2cc5a417bd51eecc884a3008b9c64f1331de3a46bf97736277b70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pegasus-wms.common \
python310-pegasus-wms.common \
python3dist-pegasus-wms.common"

RDEPENDS:${PN} += "python-abi \
python310-PyYAML"

inherit rpm
