SUMMARY = "AST Writer for docutils"
DESCRIPTION = "Docutils-ast-writer is an AST writer of Docutils."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python311-docutils-ast-writer-0.1.2-3.9.noarch.rpm"
RPM_HASH = "abb053a9a350334c1fa14cecf341abff5660bb7b122a031d0a7ca2bb87c17b088e3acdd3612b0c4ccde059a536d6f6fd204ff7da564080cc627f72418d090ef6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-docutils-ast-writer \
python3.11dist-docutils-ast-writer \
python311-docutils-ast-writer \
python3dist-docutils-ast-writer"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-docutils \
update-alternatives"

inherit rpm
