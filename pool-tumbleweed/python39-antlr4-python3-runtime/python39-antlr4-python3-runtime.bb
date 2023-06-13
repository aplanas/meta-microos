SUMMARY = "ANTLR runtime for Python 3"
DESCRIPTION = "ANTLR (ANother Tool for Language Recognition) is a powerful parser generator for \
reading, processing, executing, or translating structured text or binary files. \
 \
This package contains the runtime for Python 3."
LICENSE = "BSD-3-Clause"

PV = "4.9.3"

RPM_NAME = "python39-antlr4-python3-runtime-4.9.3-1.6.noarch.rpm"
RPM_HASH = "f73c7a582838923cb312edbc628ec6aaf91dfaf6250a17c71c44b86d704dd853404eec7267489fa532c6f5a803cf5d52dc7dd204297a1e1692c59591fe961825"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(antlr4-python3-runtime) \
python39-antlr4-python3-runtime \
python3dist(antlr4-python3-runtime)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
update-alternatives"

inherit rpm
