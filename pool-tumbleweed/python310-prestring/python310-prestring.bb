SUMMARY = "Python source code generation library"
DESCRIPTION = "Python source code generation library (with overuse with-syntax)."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python310-prestring-0.9.0-2.10.noarch.rpm"
RPM_HASH = "5edd525801792c1ec1a0a2cc27617ea5d331339e55bd202e422090c71411a46369e79021d7ac0f6930e1f957194ad15accdd7a6029538e73ff23f7fd4fd187dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-prestring \
python3.10dist-prestring \
python310-prestring \
python3dist-prestring"

RDEPENDS:${PN} += "python-abi"

inherit rpm
