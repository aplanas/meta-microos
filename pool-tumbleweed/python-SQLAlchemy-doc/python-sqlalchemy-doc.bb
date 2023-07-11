SUMMARY = "Documentation for python-SQLAlchemy"
DESCRIPTION = "This package contains HTML documentation, including tutorials and API \
reference for python-SQLAlchemy."
LICENSE = "MIT"

PV = "2.0.16"

RPM_NAME = "python-SQLAlchemy-doc-2.0.16-1.1.noarch.rpm"
RPM_HASH = "b2d7f4ef56015806ed0ecb251bb4fcef4d1df9a5722e9a74249d1e17a7f83a4bbfa55148bbf247b122045cd5c99ae0f068262abcde3826dfa7c4a8006c89e9f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-SQLAlchemy-doc \
python310-SQLAlchemy-doc \
python311-SQLAlchemy-doc \
python39-SQLAlchemy-doc"

RDEPENDS:${PN} += ""

inherit rpm
