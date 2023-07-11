SUMMARY = "OpenTelemetry Python API"
DESCRIPTION = "OpenTelemetry Python API"
LICENSE = "Apache-2.0"

PV = "1.17.0"

RPM_NAME = "python39-opentelemetry-api-1.17.0-1.3.noarch.rpm"
RPM_HASH = "1df1041502e60a60b987b3052285ac9d61cdfc8fdf169bf74c2bb35d3ee3cd147281883817076d08139ece191c1c00c760464720bd32c8af36ed219315390157"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-opentelemetry-api \
python39-opentelemetry-api \
python3dist-opentelemetry-api"

RDEPENDS:${PN} += "python-abi \
python39-Deprecated \
python39-importlib-metadata \
python39-setuptools"

inherit rpm
