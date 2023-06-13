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

RPM_NAME = "python311-venusian-3.0.0-3.1.noarch.rpm"
RPM_HASH = "cc28ad2a9439a731b23ee0aebda243a7ecbb9902f2b6f35332148b439b390f48ac145cd6110f5bf656f81484811a2bbb8a879302511652f3d1cf9bb6bbfd4cf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(venusian) \
python311-venusian \
python3dist(venusian)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
