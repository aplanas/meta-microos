SUMMARY = "JSONSchema Spec with object-oriented paths"
DESCRIPTION = "JSONSchema Spec with object-oriented paths."
LICENSE = "Apache-2.0"

PV = "0.1.4"

RPM_NAME = "python39-jsonschema-spec-0.1.4-2.1.noarch.rpm"
RPM_HASH = "e3bae40ee0871c99cce7b220b12507e78114630d8f3d03f4b5eacbd8af1c21d46d9bb0c7d633855d98e75b9272a141080a58cffe9eca15f7fa716dcc6eb34456"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jsonschema-spec) \
python39-jsonschema-spec \
python39-jsonschema_spec \
python3dist(jsonschema-spec)"
RDEPENDS:${PN} += "(python39-jsonschema >= 4.0.0 with python39-jsonschema < 4.18) \
python(abi) \
python39-PyYAML \
python39-pathable \
python39-typing_extensions"

inherit rpm
