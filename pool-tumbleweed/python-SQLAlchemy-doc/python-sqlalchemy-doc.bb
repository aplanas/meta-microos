SUMMARY = "Documentation for python-SQLAlchemy"
DESCRIPTION = "This package contains HTML documentation, including tutorials and API \
reference for python-SQLAlchemy."
LICENSE = "MIT"

PV = "2.0.19"

RPM_NAME = "python-SQLAlchemy-doc-2.0.19-3.1.noarch.rpm"
RPM_HASH = "295043805054f863c32fff5a84111d243b51c7f793dec80db919babadd652d848f93bf585a567fda885e779160053aae2aefb608f76e7f898bca56de293ef5ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-SQLAlchemy-doc \
python310-SQLAlchemy-doc \
python311-SQLAlchemy-doc \
python39-SQLAlchemy-doc"

RDEPENDS:${PN} += ""

inherit rpm
