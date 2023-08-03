SUMMARY = "Documentation for python-SQLAlchemy"
DESCRIPTION = "This package contains HTML documentation, including tutorials and API \
reference for python-SQLAlchemy."
LICENSE = "MIT"

PV = "2.0.19"

RPM_NAME = "python-SQLAlchemy-doc-2.0.19-1.1.noarch.rpm"
RPM_HASH = "4a27eb62f4f1aa82f7b3ae80efb1b4aa215d81cbb23f7942d0ca2706bfe2c9a544e71d086229470727f53e5d17d5e1634d407073a32c428bc1e61821a8f100be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-SQLAlchemy-doc \
python310-SQLAlchemy-doc \
python311-SQLAlchemy-doc \
python39-SQLAlchemy-doc"

RDEPENDS:${PN} += ""

inherit rpm
