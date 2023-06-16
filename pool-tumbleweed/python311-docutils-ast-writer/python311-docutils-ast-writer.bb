SUMMARY = "AST Writer for docutils"
DESCRIPTION = "Docutils-ast-writer is an AST writer of Docutils."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python311-docutils-ast-writer-0.1.2-3.7.noarch.rpm"
RPM_HASH = "09e5cf12835c533bdc49efa61a1308971ccbad5ae88f068e46e5ac8028e87b5535f5ea608c978042014a4d8ef4f060c6d93591e4ec8e7fa7c6f8efb3b0bd6c75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-docutils-ast-writer \
python311-docutils-ast-writer \
python3dist-docutils-ast-writer"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-docutils \
update-alternatives"

inherit rpm
