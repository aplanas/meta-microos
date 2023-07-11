SUMMARY = "AST Writer for docutils"
DESCRIPTION = "Docutils-ast-writer is an AST writer of Docutils."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python310-docutils-ast-writer-0.1.2-3.9.noarch.rpm"
RPM_HASH = "014d570c4f5776cf66641e7835b3bb8ae1ff07bb9089b897448e4cfadb3f9397f855a0d0399392e84261b18c660143f735c2040c9e296a14d235c6e82fbfafd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-docutils-ast-writer \
python310-docutils-ast-writer \
python3dist-docutils-ast-writer"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-docutils \
update-alternatives"

inherit rpm
