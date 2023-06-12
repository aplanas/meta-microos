SUMMARY = "Python object model built on top of JSON schema"
DESCRIPTION = "Build self-validating python objects using JSON schemas."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "python310-warlock-2.0.1-1.3.noarch.rpm"
RPM_HASH = "b157b148abe4c6412580130ca3ee96d2c52f21d9fd7b5542546e523e9903dd07790fee9627347e8915f3037ed4ca0b0e31a8923fc061a691b07e554726cd6a5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-warlock \
python3.10dist(warlock) \
python310-warlock \
python3dist(warlock)"
RDEPENDS:${PN} += "python(abi) \
python310-jsonpatch \
python310-jsonschema"

inherit rpm
