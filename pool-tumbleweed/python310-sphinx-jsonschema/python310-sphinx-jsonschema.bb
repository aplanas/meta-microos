SUMMARY = "Sphinx extension to display JSON Schema"
DESCRIPTION = "Sphinx extension to display JSON Schema."
LICENSE = "GPL-3.0-only"

PV = "1.16.8"

RPM_NAME = "python310-sphinx-jsonschema-1.16.8-1.10.noarch.rpm"
RPM_HASH = "4b13c9a30cf28e791fba01ed1b2463338009a2585f95258755a039dc96ad2cc8bf02c12a03198691819ae27fcf6c9a506af326e404d2ce4d5a5a44cc98cfba00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinx-jsonschema \
python310-sphinx-jsonschema \
python3dist-sphinx-jsonschema"

RDEPENDS:${PN} += "python-abi \
python310-PyYAML \
python310-docutils \
python310-jsonpointer \
python310-requests"

inherit rpm
