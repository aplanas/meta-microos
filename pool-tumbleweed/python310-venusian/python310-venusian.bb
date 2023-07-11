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

RPM_NAME = "python310-venusian-3.0.0-4.2.noarch.rpm"
RPM_HASH = "70752806a5cafa0158c90d8689c4bdc6782150647366f5a99a3c539cf6b5a7eef483131fccc833851dc69a2cd7b541ca6062da6c01d165f4497e345e6428376b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-venusian \
python310-venusian \
python3dist-venusian"

RDEPENDS:${PN} += "python-abi"

inherit rpm
