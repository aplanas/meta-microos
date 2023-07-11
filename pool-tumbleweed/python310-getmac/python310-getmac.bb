SUMMARY = "Module to get MAC addresses of remote hosts and local interfaces"
DESCRIPTION = "A Python module to get MAC addresses of remote hosts and local interfaces."
LICENSE = "MIT"

PV = "0.8.3"

RPM_NAME = "python310-getmac-0.8.3-1.6.noarch.rpm"
RPM_HASH = "37b8bf52c0656771c8bcbe0cf6c090a9f81683123a18ccf5b5b6988d7dc169030a0bf17d4c9dea681e173823c3aab5508c9f7a70a3f67f692d35bf6914a93e23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-getmac \
python310-getmac \
python3dist-getmac"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
