SUMMARY = "Sphinx extension to display JSON Schema"
DESCRIPTION = "Sphinx extension to display JSON Schema."
LICENSE = "GPL-3.0-only"

PV = "1.16.8"

RPM_NAME = "python39-sphinx-jsonschema-1.16.8-1.8.noarch.rpm"
RPM_HASH = "ca68b98392fbe723a8656a3aa782877fceb7b51c01bdf120854b3f928ed52a4607ba50bc3060d7b09761e556c2f4fa2b69aadf442070082d4944553bffe310fb"
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
