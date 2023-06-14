SUMMARY = "Python client library for accessing the Rigetti QCS API"
DESCRIPTION = "Allows access to the Rigetti Quantum Computing System API"
LICENSE = "MIT"

PV = "0.21.3"

RPM_NAME = "python39-qcs-api-client-0.21.3-1.3.noarch.rpm"
RPM_HASH = "24cc671cd162691f2a0f2745bcf4defd22fc560a137a9c706caaee6aab7a2d2382e8fd9b227869658738535c07010fd0432140a9455b1fe3963fb55ad5ffdc70"
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
