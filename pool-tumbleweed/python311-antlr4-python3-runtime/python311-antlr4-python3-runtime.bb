SUMMARY = "ANTLR runtime for Python 3"
DESCRIPTION = "ANTLR (ANother Tool for Language Recognition) is a powerful parser generator for \
reading, processing, executing, or translating structured text or binary files. \
 \
This package contains the runtime for Python 3."
LICENSE = "BSD-3-Clause"

PV = "4.9.3"

RPM_NAME = "python311-antlr4-python3-runtime-4.9.3-1.7.noarch.rpm"
RPM_HASH = "67913efd423095faa621fafd5338992a7113fea1532b322e7436eb12e9f15527e7b90970d763ae48c92a929001e27179f6f844dbbc9b42d03555bf1e01adf16a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-antlr4-python3-runtime \
python3.11dist-antlr4-python3-runtime \
python311-antlr4-python3-runtime \
python3dist-antlr4-python3-runtime"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
