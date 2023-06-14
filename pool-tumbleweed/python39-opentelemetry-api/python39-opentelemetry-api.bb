SUMMARY = "OpenTelemetry Python API"
DESCRIPTION = "OpenTelemetry Python API"
LICENSE = "Apache-2.0"

PV = "1.17.0"

RPM_NAME = "python39-opentelemetry-api-1.17.0-1.1.noarch.rpm"
RPM_HASH = "e6042319bc3e63053c38c69fe6abf75b13e6e18996195234c2651e2effdfc3d26f268162ddad9364c2dbca5aab405895ffa761e56d68834db052dd35c8970473"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-opentelemetry-api \
python39-opentelemetry-api \
python3dist-opentelemetry-api"

RDEPENDS:${PN} += "python-abi \
python39-Deprecated \
python39-importlib-metadata \
python39-setuptools"

inherit rpm
