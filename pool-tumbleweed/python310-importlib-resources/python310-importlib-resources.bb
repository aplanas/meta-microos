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

RPM_NAME = "python310-importlib-resources-5.12.0-1.3.noarch.rpm"
RPM_HASH = "b149a8731aff1f13a1b12926a9e5dc54476f19dcd0b9ba21144a88813ae7c7db16aef773d3fe75c568971fdcf9d9cb2d396c4675c59c7411c640e470d3ab6ae2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-importlib-resources \
python310-importlib-resources \
python3dist-importlib-resources"

RDEPENDS:${PN} += "python-abi"

inherit rpm
