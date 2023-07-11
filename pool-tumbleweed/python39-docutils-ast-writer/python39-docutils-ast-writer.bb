SUMMARY = "AST Writer for docutils"
DESCRIPTION = "Docutils-ast-writer is an AST writer of Docutils."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python39-docutils-ast-writer-0.1.2-3.9.noarch.rpm"
RPM_HASH = "d8855aa25971bcccdd8cf8bc5c7adbc158deadb0873828e891526e9126f48fb978112a7be610dcd7216d227f3eba8faf060735b1e17e1f358676481e53913330"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-docutils-ast-writer \
python39-docutils-ast-writer \
python3dist-docutils-ast-writer"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-docutils \
update-alternatives"

inherit rpm
