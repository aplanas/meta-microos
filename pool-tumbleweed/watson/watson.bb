SUMMARY = "CLI time tracker"
DESCRIPTION = "Watson helps managing time. It can tell how much time was spent on projects. \
It generates reports for clients."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "watson-2.1.0-1.4.noarch.rpm"
RPM_HASH = "6af8fbebbd3d95a9c7dd45566024156bc27b04972516c8b057ab5408a2a044fbef5151af26d78ca4f8295c3c49e41679201a1c889dc4b04a36964c85635f0abe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-td-watson \
python3dist-td-watson \
watson"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-arrow \
python3-click \
python3-click-didyoumean \
python3-requests"

inherit rpm
