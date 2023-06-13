SUMMARY = "AST Writer for docutils"
DESCRIPTION = "Docutils-ast-writer is an AST writer of Docutils."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python39-docutils-ast-writer-0.1.2-3.7.noarch.rpm"
RPM_HASH = "ddab3b9dd3d9881289eb702a8f831ac3afe292321938e7d54c5af6b77e3dd512ccdd86832d5e317cd47dc8fad50b37504c8dfa301877b5826bbb82c3c92cf00a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(docutils-ast-writer) \
python39-docutils-ast-writer \
python3dist(docutils-ast-writer)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-docutils \
update-alternatives"

inherit rpm
