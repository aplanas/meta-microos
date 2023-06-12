SUMMARY = "Python client library for accessing the Rigetti QCS API"
DESCRIPTION = "Allows access to the Rigetti Quantum Computing System API"
LICENSE = "MIT"

PV = "0.21.3"

RPM_NAME = "python310-qcs-api-client-0.21.3-1.3.noarch.rpm"
RPM_HASH = "f415d0202b601eb5356a7caf8c1a666d2d0da1870c5b87e3d0b046a7c9f0720b7e6081952ea8dbca9e7bd6b38bdcdb4fdb63e996a0eedfeef7d5b54766f42e5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-qcs-api-client \
python3.10dist(qcs-api-client) \
python310-qcs-api-client \
python3dist(qcs-api-client)"
RDEPENDS:${PN} += "python(abi) \
python310-PyJWT \
python310-attrs \
python310-dateutil \
python310-httpx \
python310-iso8601 \
python310-pyRFC3339 \
python310-pydantic \
python310-retrying \
python310-toml"

inherit rpm
