SUMMARY = "ClusterShell module for Python 3"
DESCRIPTION = "ClusterShell Python 3 module and related command line tools."
LICENSE = "LGPL-2.1-or-later"

PV = "1.9.1"

RPM_NAME = "python3-clustershell-1.9.1-1.2.noarch.rpm"
RPM_HASH = "7423444278296b5c5a4501a5902912686df7f8ba8ad95afd567ab83de2b8d5a36cd06078844e7eb9852e3178728c71189033122b6bf463e2aa3a964112148e66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-clustershell \
python3.11dist-clustershell \
python3dist-clustershell"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-PyYAML \
python3-setuptools"

inherit rpm
