SUMMARY = "Microsoft Azure Maps Render Client Library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Maps Services for Render."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python311-azure-maps-render-1.0.0~b2-1.1.noarch.rpm"
RPM_HASH = "184be7a48765583628e6016f8593141ccda5ce4b6c34c2e1bac59374c52f28829529d15c494a306ec72d080676752aabfd0de9aed5ec44daa2f7efd3bba0fffa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-maps-render \
python3.11dist-azure-maps-render \
python311-azure-maps-render \
python3dist-azure-maps-render"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-nspkg \
python311-msrest \
python311-requests"

inherit rpm
