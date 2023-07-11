SUMMARY = "JSONSchema Spec with object-oriented paths"
DESCRIPTION = "JSONSchema Spec with object-oriented paths."
LICENSE = "Apache-2.0"

PV = "0.1.6"

RPM_NAME = "python311-jsonschema-spec-0.1.6-1.1.noarch.rpm"
RPM_HASH = "0a9684813ca0303cac6883b7f9a819e099d70bef60f6d8e77d103a475bed8aabe52a4160e77b6e5748f54bcbab9a25f8b97595d6e5b0ea766b7a7fb8f6acbb15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonschema-spec \
python3.11dist-jsonschema-spec \
python311-jsonschema-spec \
python3dist-jsonschema-spec"

RDEPENDS:${PN} += "-python311-jsonschema >= 4.0.0 with python311-jsonschema < 4.18 \
python-abi \
python311-PyYAML \
python311-pathable \
python311-typing-extensions"

inherit rpm
