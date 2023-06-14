SUMMARY = "JSONSchema Spec with object-oriented paths"
DESCRIPTION = "JSONSchema Spec with object-oriented paths."
LICENSE = "Apache-2.0"

PV = "0.1.4"

RPM_NAME = "python310-jsonschema-spec-0.1.4-2.1.noarch.rpm"
RPM_HASH = "74bc89faf31dd7080ae5053743ea9dbe97a45ed25b93335309eec09e1a468527b714d6eae81173d5c6e2b2cd735511be913d124ca26352964dc67f152f68f7d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonschema-spec \
python3.10dist-jsonschema-spec \
python310-jsonschema-spec \
python3dist-jsonschema-spec"

RDEPENDS:${PN} += "-python310-jsonschema >= 4.0.0 with python310-jsonschema < 4.18 \
python-abi \
python310-PyYAML \
python310-pathable \
python310-typing-extensions"

inherit rpm
