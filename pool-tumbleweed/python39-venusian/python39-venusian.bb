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

RPM_NAME = "python39-venusian-3.0.0-4.2.noarch.rpm"
RPM_HASH = "f502da8fe57cd5bd11963d29848e0f3204e18b7dbae8ed91dca5d424fd8e0d0d37f927abed79a2517ace9bc33bf4f6806a50c90ce3e7e1b4a66af20633317e2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-venusian \
python39-venusian \
python3dist-venusian"

RDEPENDS:${PN} += "python-abi"

inherit rpm
