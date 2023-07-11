SUMMARY = "Read resources from Python packages"
DESCRIPTION = "importlib_resources is a backport of Python standard library \
importlib.resources module for older Pythons. Users of Python 3.9 and \
beyond should use the standard library module, since for these versions, \
importlib_resources just delegates to that module. \
 \
The key goal of this module is to replace parts of pkg_resources with a \
solution in Python’s stdlib that relies on well-defined APIs. This makes \
reading resources included in packages easier, with more stable and \
consistent semantics."
LICENSE = "Apache-2.0"

PV = "5.12.0"

RPM_NAME = "python39-importlib-resources-5.12.0-1.3.noarch.rpm"
RPM_HASH = "de19c32e5618230b221072dd0d26a072716828800a6cc3b4f946bfb6424df96c2210817be732e983bef84087907184fee4057fa3c14111023bf4c2f15288c400"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-importlib-resources \
python39-importlib-resources \
python3dist-importlib-resources"

RDEPENDS:${PN} += "python-abi \
python39-zipp"

inherit rpm
