SUMMARY = "Documentation files for python-blue"
DESCRIPTION = "HTML Documentation and examples for python-blue."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python-blue-doc-0.9.1-2.3.noarch.rpm"
RPM_HASH = "d8947435a51ac5260d248d909ac8cf7aae167095b4068c5bd6bff8006421284b5489e05fa23a1c5f9c8ada181a6a1c48909014ec39e05ed2e21258d87d921bc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-blue-doc \
python310-foo-doc \
python311-foo-doc \
python39-foo-doc"

RDEPENDS:${PN} += ""

inherit rpm
