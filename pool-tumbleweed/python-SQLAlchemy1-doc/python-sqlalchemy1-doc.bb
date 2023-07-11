SUMMARY = "Documentation for python-SQLAlchemy"
DESCRIPTION = "This package contains HTML documentation, including tutorials and API \
reference for python-SQLAlchemy."
LICENSE = "MIT"

PV = "1.4.46"

RPM_NAME = "python-SQLAlchemy1-doc-1.4.46-3.3.noarch.rpm"
RPM_HASH = "044988ea48f2f120e9addc92ea59a8e1b706111b84df87fd228a3474ab9f66c2aa3392836f3b68964d09000a032b64b7e8ddd81363b6fccadbb6c2881482824e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-SQLAlchemy1-doc \
python310-SQLAlchemy-doc \
python311-SQLAlchemy-doc \
python39-SQLAlchemy-doc"

RDEPENDS:${PN} += ""

inherit rpm
