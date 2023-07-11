SUMMARY = "A portable tool for executing test suites"
DESCRIPTION = "Lit is a portable tool for executing LLVM and Clang style test suites, \
summarizing their results, and providing indication of failures. Lit is \
designed to be a lightweight testing tool with as simple a user interface \
as possible/"
LICENSE = "NCSA"

PV = "0.6.0"

RPM_NAME = "python310-lit-0.6.0-3.10.noarch.rpm"
RPM_HASH = "818e74d64df1c2070606f370c28a9660bc52144016f7fd6b633e3c2108335278c121c2f53c4173a7434d30477129b59104f33cf70f6e048eeb078e7ebb1195e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lit \
python3.10dist-lit \
python310-lit \
python3dist-lit"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
