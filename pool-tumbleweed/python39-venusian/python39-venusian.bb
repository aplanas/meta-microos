SUMMARY = "A library for deferring decorator actions"
DESCRIPTION = "Venusian is a library which allows framework authors to defer \
decorator actions.  Instead of taking actions when a function (or \
class) decorator is executed at import time, you can defer the action \
usually taken by the decorator until a separate 'scan' phase. \
 \
See the 'docs' directory of the package or the online documentation at \
http://docs.pylonsproject.org/projects/venusian/dev/."
LICENSE = "SUSE-Repoze & ZPL-2.1"

PV = "3.0.0"

RPM_NAME = "python39-venusian-3.0.0-3.1.noarch.rpm"
RPM_HASH = "22c4261bdca9cb9034547a57081edc6e8d053d3e186cb8bf34969a48c2019b9e40afc24b1ca860ab0b69ebe6d8265595596e06520372fe07a2dd98c0671e8977"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-venusian \
python39-venusian \
python3dist-venusian"

RDEPENDS:${PN} += "python-abi"

inherit rpm
