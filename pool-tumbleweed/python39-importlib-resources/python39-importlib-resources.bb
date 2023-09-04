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

PV = "6.0.1"

RPM_NAME = "python39-importlib-resources-6.0.1-1.1.noarch.rpm"
RPM_HASH = "30b5be37172426c9f61fc63469415bb7869cbfc3712b223c4a6b43bc8b64503ba29cd8cda123fa83308f3aa61c9eb8f959c94edf30e5ff6d882bf17202468ba7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-importlib-resources \
python39-importlib-resources \
python3dist-importlib-resources"

RDEPENDS:${PN} += "python-abi \
python39-zipp"

inherit rpm
