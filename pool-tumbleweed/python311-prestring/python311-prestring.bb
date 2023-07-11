SUMMARY = "Python source code generation library"
DESCRIPTION = "Python source code generation library (with overuse with-syntax)."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python311-prestring-0.9.0-2.12.noarch.rpm"
RPM_HASH = "ac6692f964f4b6cf44206c25f074df6247a884165607fed0f03350b6e7b2eedba05bb33fdcadfdbec67187c51572c1fb659edd113533b66c40dafcd20dd073c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-prestring \
python3.11dist-prestring \
python311-prestring \
python3dist-prestring"

RDEPENDS:${PN} += "python-abi"

inherit rpm
