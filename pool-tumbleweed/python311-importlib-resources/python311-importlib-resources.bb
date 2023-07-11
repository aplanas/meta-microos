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

RPM_NAME = "python311-importlib-resources-5.12.0-1.3.noarch.rpm"
RPM_HASH = "660d6d09d409b400d971b69093553d8e37a889948f251b802e1e30fc3c83b768a2e2714849bc2a63a03597c7ff41b41e3d39099e3114d7fc80d0988aedc1e682"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-importlib-resources \
python3.11dist-importlib-resources \
python311-importlib-resources \
python3dist-importlib-resources"

RDEPENDS:${PN} += "python-abi"

inherit rpm
