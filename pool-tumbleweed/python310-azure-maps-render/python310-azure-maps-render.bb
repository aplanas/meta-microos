SUMMARY = "Microsoft Azure Maps Render Client Library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Maps Services for Render."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python310-azure-maps-render-1.0.0~b2-1.1.noarch.rpm"
RPM_HASH = "ecddcab52726996e6f61583774a732a8c432774866a16b8887ac560734e03dfbea039c7a9d7b2dd55bab584741e1d8b6b42cbf4861de656e8460d9f83fef9f98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-maps-render \
python310-azure-maps-render \
python3dist-azure-maps-render"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-nspkg \
python310-msrest \
python310-requests"

inherit rpm
