SUMMARY = "Python object model built on top of JSON schema"
DESCRIPTION = "Build self-validating python objects using JSON schemas."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "python39-warlock-2.0.1-1.3.noarch.rpm"
RPM_HASH = "1bbf79d33dd9ef151f4332d24078da0e99c33ca196a562465a315666f0af7e86beadfc6372175cd0f9845748dcdfadcdb748eed45f3708a971860397a150ca3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-warlock \
python39-warlock \
python3dist-warlock"

RDEPENDS:${PN} += "python-abi \
python39-jsonpatch \
python39-jsonschema"

inherit rpm
