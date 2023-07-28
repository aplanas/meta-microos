SUMMARY = "JSONSchema Spec with object-oriented paths"
DESCRIPTION = "JSONSchema Spec with object-oriented paths."
LICENSE = "Apache-2.0"

PV = "0.2.3"

RPM_NAME = "python311-jsonschema-spec-0.2.3-1.1.noarch.rpm"
RPM_HASH = "ebca3c1928c62b8c4ca3ce3b9f3a5a80cd1af41d9e06d44596464c8df0b6127fd026fc3d9a5477264ad5818dfee63ebb37abeea5b4555a964c6e825e202eed29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonschema-spec \
python3.11dist-jsonschema-spec \
python311-jsonschema-spec \
python3dist-jsonschema-spec"

RDEPENDS:${PN} += "python-abi \
python311-PyYAML \
python311-pathable \
python311-referencing"

inherit rpm
