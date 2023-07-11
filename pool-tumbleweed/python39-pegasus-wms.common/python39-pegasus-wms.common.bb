SUMMARY = "Pegasus Workflow Management System Python Commons"
DESCRIPTION = "This package contains common files for the Python APIs for Pegasus WMS."
LICENSE = "Apache-2.0"

PV = "5.0.3"

RPM_NAME = "python39-pegasus-wms.common-5.0.3-2.5.noarch.rpm"
RPM_HASH = "7df92900dade551b4b39acc88f7721be692cca64fac978eafef80e0e5813b9c7affc79f8bd8c2ab097ff020d2316188c22827ee8c70e65222a2771e474e71a82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pegasus-wms.common \
python39-pegasus-wms.common \
python3dist-pegasus-wms.common"

RDEPENDS:${PN} += "python-abi \
python39-PyYAML"

inherit rpm
