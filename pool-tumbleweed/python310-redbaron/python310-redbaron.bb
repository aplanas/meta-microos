SUMMARY = "Python module for writing code that modifies source code"
DESCRIPTION = "RedBaron is a Python library and tool to write code that modifies \
source code. This includes writing custom refactoring, generic \
refactoring, tools, IDE or directly modifying source code in \
IPython."
LICENSE = "LGPL-3.0-or-later"

PV = "0.9.2"

RPM_NAME = "python310-redbaron-0.9.2-3.16.noarch.rpm"
RPM_HASH = "6244fe90ad38098ddb8c598016a8a9f3496436f3779cc87ee2e2ba4a519481eec901664e7080ec1c3c6d53a18db0e77181a2a4b1ec10c88e18a41a12425d0de8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-redbaron \
python310-redbaron \
python3dist-redbaron"

RDEPENDS:${PN} += "python-abi \
python310-baron"

inherit rpm
