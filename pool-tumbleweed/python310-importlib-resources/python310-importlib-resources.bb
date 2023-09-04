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

RPM_NAME = "python310-importlib-resources-6.0.1-1.1.noarch.rpm"
RPM_HASH = "7ecfff0893a8a73794763ab8955b5c757f0e49e33172ceed49bfa167d3625410049ae9ea680b38280c10458f019638cea1df7fc30918bcd1cfce0629afafcc38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-importlib-resources \
python310-importlib-resources \
python3dist-importlib-resources"

RDEPENDS:${PN} += "python-abi"

inherit rpm
