SUMMARY = "Documentation for python-SQLAlchemy"
DESCRIPTION = "This package contains HTML documentation, including tutorials and API \
reference for python-SQLAlchemy."
LICENSE = "MIT"

PV = "2.0.19"

RPM_NAME = "python-SQLAlchemy-doc-2.0.19-2.1.noarch.rpm"
RPM_HASH = "9ab3b8006ce5e72a360319fd432c8535bd293ea501cd839ce9dded4d84d7c411be20e003c68917f8b89d07491d9d46a73d618eedf3ebf1bd29a07059fbee73b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-SQLAlchemy-doc \
python310-SQLAlchemy-doc \
python311-SQLAlchemy-doc \
python39-SQLAlchemy-doc"

RDEPENDS:${PN} += ""

inherit rpm
