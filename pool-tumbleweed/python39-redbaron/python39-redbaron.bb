SUMMARY = "Python module for writing code that modifies source code"
DESCRIPTION = "RedBaron is a Python library and tool to write code that modifies \
source code. This includes writing custom refactoring, generic \
refactoring, tools, IDE or directly modifying source code in \
IPython."
LICENSE = "LGPL-3.0-or-later"

PV = "0.9.2"

RPM_NAME = "python39-redbaron-0.9.2-3.16.noarch.rpm"
RPM_HASH = "cf61c15b41528b04f1c893a4a3f990414488d3bc26f82039aa3512376ad91ecef109223d122675ed5fbccf9ddf9e5fe37ad4b29dd9c40f8c5c3f1c8008dc6a3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-redbaron \
python39-redbaron \
python3dist-redbaron"

RDEPENDS:${PN} += "python-abi \
python39-baron"

inherit rpm
