SUMMARY = "Python module for writing code that modifies source code"
DESCRIPTION = "RedBaron is a Python library and tool to write code that modifies \
source code. This includes writing custom refactoring, generic \
refactoring, tools, IDE or directly modifying source code in \
IPython."
LICENSE = "LGPL-3.0-or-later"

PV = "0.9.2"

RPM_NAME = "python311-redbaron-0.9.2-3.16.noarch.rpm"
RPM_HASH = "71fdfc9c4d382dde1a501a3d60a3edd94030b8af6802ba303db9cbc543af2320f6b76e4fb52c2ed57959b3719b54f90b7e2656a591ad12df5a310830ffef5a63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-redbaron \
python3.11dist-redbaron \
python311-redbaron \
python3dist-redbaron"

RDEPENDS:${PN} += "python-abi \
python311-baron"

inherit rpm
