SUMMARY = "Python client library for accessing the Rigetti QCS API"
DESCRIPTION = "Allows access to the Rigetti Quantum Computing System API"
LICENSE = "MIT"

PV = "0.21.3"

RPM_NAME = "python310-qcs-api-client-0.21.3-1.5.noarch.rpm"
RPM_HASH = "c984a115d84607b67a37df91d5210f4fbfe5774035641d52501cc890e18b2f0fbfbf5d435930d1329bbd0bde26c0a2501ba7974b0e4ae32a173b24a5f2e4b9d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-qcs-api-client \
python310-qcs-api-client \
python3dist-qcs-api-client"

RDEPENDS:${PN} += "python-abi \
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
