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

RPM_NAME = "python311-importlib-resources-5.12.0-1.1.noarch.rpm"
RPM_HASH = "560b08fd2e964173832aaef9de7d154b842638bbf30002d89447ef3baa55f7fbfc1d8249536806bce474041f9aaf8d679ba25f1d7a9db435a2daf345ee6746f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(importlib-resources) \
python311-importlib-resources \
python311-importlib_resources \
python3dist(importlib-resources)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
