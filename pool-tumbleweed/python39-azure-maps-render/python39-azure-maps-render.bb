SUMMARY = "Microsoft Azure Maps Render Client Library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Maps Services for Render."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python39-azure-maps-render-1.0.0~b2-1.1.noarch.rpm"
RPM_HASH = "9a32aab5e34989eb50337762b1780a36f644656b10affcdc3e6fa33abc852d01f56454545b240cd5a754a4eb20113c925700d29a69afded1e0d4a0c8318b32e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-maps-render \
python39-azure-maps-render \
python3dist-azure-maps-render"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-nspkg \
python39-msrest \
python39-requests"

inherit rpm
