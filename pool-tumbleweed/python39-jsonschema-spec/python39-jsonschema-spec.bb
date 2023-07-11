SUMMARY = "JSONSchema Spec with object-oriented paths"
DESCRIPTION = "JSONSchema Spec with object-oriented paths."
LICENSE = "Apache-2.0"

PV = "0.1.6"

RPM_NAME = "python39-jsonschema-spec-0.1.6-1.1.noarch.rpm"
RPM_HASH = "cd3cc97565ef08f3ae204ff79f1923c9f1c112284ee162fd5b98c64ef23911ac7184231327fcece3fe29a35753046330c5a47e5b82f6be7bb0e9f9db867e10bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jsonschema-spec \
python39-jsonschema-spec \
python3dist-jsonschema-spec"

RDEPENDS:${PN} += "-python39-jsonschema >= 4.0.0 with python39-jsonschema < 4.18 \
python-abi \
python39-PyYAML \
python39-pathable \
python39-typing-extensions"

inherit rpm
