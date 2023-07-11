SUMMARY = "ANTLR runtime for Python 3"
DESCRIPTION = "ANTLR (ANother Tool for Language Recognition) is a powerful parser generator for \
reading, processing, executing, or translating structured text or binary files. \
 \
This package contains the runtime for Python 3."
LICENSE = "BSD-3-Clause"

PV = "4.9.3"

RPM_NAME = "python310-antlr4-python3-runtime-4.9.3-1.7.noarch.rpm"
RPM_HASH = "3c4f724fab43827a3d7da70188d3d59f0b10961a3cb2ca5f752e6140c942e64fb17c6d0fc4f05c47d45d8591f340c55fa9e0077ecd363438f2bf2821bf52bb8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-antlr4-python3-runtime \
python310-antlr4-python3-runtime \
python3dist-antlr4-python3-runtime"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
