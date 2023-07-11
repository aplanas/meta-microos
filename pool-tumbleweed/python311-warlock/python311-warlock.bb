SUMMARY = "Python object model built on top of JSON schema"
DESCRIPTION = "Build self-validating python objects using JSON schemas."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "python311-warlock-2.0.1-1.5.noarch.rpm"
RPM_HASH = "6eed500a50e3cfe90b860fb3badfa02361599c3e602db4f77ad6e800117fa5853132b06355ec303612fd5823245ac6114ea3015d682e231fd5ca242876bd0ad4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-warlock \
python3.11dist-warlock \
python311-warlock \
python3dist-warlock"

RDEPENDS:${PN} += "python-abi \
python311-jsonpatch \
python311-jsonschema"

inherit rpm
