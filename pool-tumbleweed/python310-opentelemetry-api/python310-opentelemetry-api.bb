SUMMARY = "OpenTelemetry Python API"
DESCRIPTION = "OpenTelemetry Python API"
LICENSE = "Apache-2.0"

PV = "1.17.0"

RPM_NAME = "python310-opentelemetry-api-1.17.0-1.3.noarch.rpm"
RPM_HASH = "965545f318227a88819520131d8b376abc8b406d2ca0340da3b12f7c665eefb7e8c4ccdbd57886a9fff944219e66836b6ca2376d281fc5d72db204a120340f9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-opentelemetry-api \
python310-opentelemetry-api \
python3dist-opentelemetry-api"

RDEPENDS:${PN} += "python-abi \
python310-Deprecated \
python310-importlib-metadata \
python310-setuptools"

inherit rpm
