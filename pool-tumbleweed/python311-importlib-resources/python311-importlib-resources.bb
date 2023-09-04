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

RPM_NAME = "python311-importlib-resources-6.0.1-1.1.noarch.rpm"
RPM_HASH = "7b4f4d382f1c4fab58bc955b4e0a7e1e098a65524688e1f5ba4e36ff1cc2fec7cf734c7ab4f9892d7116bff360231118cdc1b6c4b9b4ede6aab181778899535f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-importlib-resources \
python3.11dist-importlib-resources \
python311-importlib-resources \
python3dist-importlib-resources"

RDEPENDS:${PN} += "python-abi"

inherit rpm
