SUMMARY = "Sphinx extension to display JSON Schema"
DESCRIPTION = "Sphinx extension to display JSON Schema."
LICENSE = "GPL-3.0-only"

PV = "1.16.8"

RPM_NAME = "python39-sphinx-jsonschema-1.16.8-1.10.noarch.rpm"
RPM_HASH = "7b08da37e0ff52e976b9785ef886b0733646e3ad8533cad3c7f895b1ee068affc933b7c0879e6f86d4fa5db5287ca89e97dd1dae5b1e044897e5ba4e9783086d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinx-jsonschema \
python39-sphinx-jsonschema \
python3dist-sphinx-jsonschema"

RDEPENDS:${PN} += "python-abi \
python39-PyYAML \
python39-docutils \
python39-jsonpointer \
python39-requests"

inherit rpm
