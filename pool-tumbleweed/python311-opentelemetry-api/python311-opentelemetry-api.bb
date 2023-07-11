SUMMARY = "OpenTelemetry Python API"
DESCRIPTION = "OpenTelemetry Python API"
LICENSE = "Apache-2.0"

PV = "1.17.0"

RPM_NAME = "python311-opentelemetry-api-1.17.0-1.3.noarch.rpm"
RPM_HASH = "d1f34eea2e8a5562e41f13c713b0312db444a7946ce039658e4a10c5052261ec755c34c3a28badf9ef01e4bf6bb1efcbf6a169cc9f431a6dbb74645432539e18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opentelemetry-api \
python3.11dist-opentelemetry-api \
python311-opentelemetry-api \
python3dist-opentelemetry-api"

RDEPENDS:${PN} += "python-abi \
python311-Deprecated \
python311-importlib-metadata \
python311-setuptools"

inherit rpm
