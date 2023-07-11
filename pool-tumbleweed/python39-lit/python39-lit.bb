SUMMARY = "A portable tool for executing test suites"
DESCRIPTION = "Lit is a portable tool for executing LLVM and Clang style test suites, \
summarizing their results, and providing indication of failures. Lit is \
designed to be a lightweight testing tool with as simple a user interface \
as possible/"
LICENSE = "NCSA"

PV = "0.6.0"

RPM_NAME = "python39-lit-0.6.0-3.10.noarch.rpm"
RPM_HASH = "6b6f339c9a15e72983f6528bed71e51dcc722e0568b0a967d309429b24417602a02dbe9323a9132ba135773544cad65057399f66c5cb11134918435d09001975"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lit \
python3.9dist-lit \
python39-lit \
python3dist-lit"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
