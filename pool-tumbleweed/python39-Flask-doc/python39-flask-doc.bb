SUMMARY = "Documentation for python-Flask"
DESCRIPTION = "This package contains HTML documentation, including tutorials and API \
reference for python-Flask."
LICENSE = "BSD-3-Clause"

PV = "2.3.2"

RPM_NAME = "python39-Flask-doc-2.3.2-1.1.noarch.rpm"
RPM_HASH = "727ba6a64f8354e1cb8fda0606aa5fd4c3c5d6868a357e9a454b8bc2c4e40cf1a5ade0dc27a47acc7c261bed1c95454e60d76a222e3be5d31d2327e27a6bd73f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-Flask-doc"

RDEPENDS:${PN} += "python39-Flask"

inherit rpm
