SUMMARY = "Tools to work with collections"
DESCRIPTION = "jaraco.collections Tools for working with collections. \
Models and classes to supplement the stdlib ‘collections’ module."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python310-jaraco.collections-4.1.0-1.3.noarch.rpm"
RPM_HASH = "1a19e0a5c0c04f47127b4830924da89f50db5ef66bbaa9b6ff902b494f47e80b3e74d27a20f58673c02ba623bb5bd31dea8bfb3bd9c31f11b78949a6cb0575cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jaraco.collections \
python310-jaraco.collections \
python3dist-jaraco.collections"

RDEPENDS:${PN} += "python-abi \
python310-jaraco.classes \
python310-jaraco.text"

inherit rpm
