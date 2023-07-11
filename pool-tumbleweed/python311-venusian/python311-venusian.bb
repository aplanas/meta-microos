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

RPM_NAME = "python311-venusian-3.0.0-4.2.noarch.rpm"
RPM_HASH = "1ea54d1f1e324f45815cef3263f91665e4c894d3c5b734ccd93aa9b0abc5bb0d825684799b7e5c7815941b0a0baae243288b27f3fb45624e2dce5f21e552d4f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-venusian \
python3.11dist-venusian \
python311-venusian \
python3dist-venusian"

RDEPENDS:${PN} += "python-abi"

inherit rpm
