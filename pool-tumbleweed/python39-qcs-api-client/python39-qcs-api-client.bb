SUMMARY = "Python client library for accessing the Rigetti QCS API"
DESCRIPTION = "Allows access to the Rigetti Quantum Computing System API"
LICENSE = "MIT"

PV = "0.21.3"

RPM_NAME = "python39-qcs-api-client-0.21.3-1.5.noarch.rpm"
RPM_HASH = "7d2e4e64062b0c06725371fc815c7c44f30f8a6ceeef69ba1e9342dd7777892dde438bd916a82e46114fbbff14513b4848a41b78b55a884a8e9a13939e640086"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-qcs-api-client \
python39-qcs-api-client \
python3dist-qcs-api-client"

RDEPENDS:${PN} += "python-abi \
python39-PyJWT \
python39-attrs \
python39-dateutil \
python39-httpx \
python39-iso8601 \
python39-pyRFC3339 \
python39-pydantic \
python39-retrying \
python39-toml"

inherit rpm
