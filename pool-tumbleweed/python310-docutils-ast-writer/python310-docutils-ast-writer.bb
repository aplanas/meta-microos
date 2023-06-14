SUMMARY = "AST Writer for docutils"
DESCRIPTION = "Docutils-ast-writer is an AST writer of Docutils."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python310-docutils-ast-writer-0.1.2-3.7.noarch.rpm"
RPM_HASH = "b8074e854fde3575eb00b3388c1464fb8312aa1f6c5cefd6c25d1792b6b1fc62de7455716a8f1ffff0da7f6f4bb60fad4d97a2ccdd3b37325394a71202bf107b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-docutils-ast-writer \
python3.10dist-docutils-ast-writer \
python310-docutils-ast-writer \
python3dist-docutils-ast-writer"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-docutils \
update-alternatives"

inherit rpm
