SUMMARY = "JSONSchema Spec with object-oriented paths"
DESCRIPTION = "JSONSchema Spec with object-oriented paths."
LICENSE = "Apache-2.0"

PV = "0.2.3"

RPM_NAME = "python39-jsonschema-spec-0.2.3-1.1.noarch.rpm"
RPM_HASH = "c2505e5f63b15838703b10907745aaeadadc6d0486a45c4076076107c5f6e004717150aa44d4c1da4ef59955e959432b5e4921cf574c37a2630aac05bcb3577c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jsonschema-spec \
python39-jsonschema-spec \
python3dist-jsonschema-spec"

RDEPENDS:${PN} += "python-abi \
python39-PyYAML \
python39-pathable \
python39-referencing"

inherit rpm
