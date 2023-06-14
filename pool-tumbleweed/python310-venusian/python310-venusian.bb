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

RPM_NAME = "python310-venusian-3.0.0-3.1.noarch.rpm"
RPM_HASH = "258cd942e7290aab9d17632a88958ba789465c845ba6b9baa858ae214f7959085e5f3871b9066b306dc0b002f8f34f56f899e57f0e3631a994fd9cb51c0b8834"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-venusian \
python3.10dist-venusian \
python310-venusian \
python3dist-venusian"

RDEPENDS:${PN} += "python-abi"

inherit rpm
