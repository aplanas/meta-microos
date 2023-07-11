SUMMARY = "Sphinx extension to display JSON Schema"
DESCRIPTION = "Sphinx extension to display JSON Schema."
LICENSE = "GPL-3.0-only"

PV = "1.16.8"

RPM_NAME = "python311-sphinx-jsonschema-1.16.8-1.10.noarch.rpm"
RPM_HASH = "7a2044b44a6d34346d8175216b411b64c763f03f7a942653d6c05a13b368a29ea28a4a78ca82ad20d6d98d15f282dfd6bd7e7d440f7e8303eb4108fb0ffbc634"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-jsonschema \
python3.11dist-sphinx-jsonschema \
python311-sphinx-jsonschema \
python3dist-sphinx-jsonschema"

RDEPENDS:${PN} += "python-abi \
python311-PyYAML \
python311-docutils \
python311-jsonpointer \
python311-requests"

inherit rpm
