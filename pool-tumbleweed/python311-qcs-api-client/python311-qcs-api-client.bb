SUMMARY = "Python client library for accessing the Rigetti QCS API"
DESCRIPTION = "Allows access to the Rigetti Quantum Computing System API"
LICENSE = "MIT"

PV = "0.21.3"

RPM_NAME = "python311-qcs-api-client-0.21.3-1.5.noarch.rpm"
RPM_HASH = "e1c0abb6cbae189e804e779fd377b1dd29c024c825d015068258347ae5fbc80ced1376ceb904e2aecda4bf789c49a922ba895e160045b1f8766db4a2c85d660d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-qcs-api-client \
python3.11dist-qcs-api-client \
python311-qcs-api-client \
python3dist-qcs-api-client"

RDEPENDS:${PN} += "python-abi \
python311-PyJWT \
python311-attrs \
python311-dateutil \
python311-httpx \
python311-iso8601 \
python311-pyRFC3339 \
python311-pydantic \
python311-retrying \
python311-toml"

inherit rpm
