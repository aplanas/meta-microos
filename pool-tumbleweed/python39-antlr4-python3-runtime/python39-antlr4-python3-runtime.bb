SUMMARY = "ANTLR runtime for Python 3"
DESCRIPTION = "ANTLR (ANother Tool for Language Recognition) is a powerful parser generator for \
reading, processing, executing, or translating structured text or binary files. \
 \
This package contains the runtime for Python 3."
LICENSE = "BSD-3-Clause"

PV = "4.9.3"

RPM_NAME = "python39-antlr4-python3-runtime-4.9.3-1.7.noarch.rpm"
RPM_HASH = "e954e1fe487bcb781e51a5bc5a9b8d5e75e9dcaf78315f429b9f6d53a45799f4a44ed57cc75bac170a4aecf6b085c8a5a15c04dcb4545cf223474897cf706150"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-antlr4-python3-runtime \
python39-antlr4-python3-runtime \
python3dist-antlr4-python3-runtime"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
