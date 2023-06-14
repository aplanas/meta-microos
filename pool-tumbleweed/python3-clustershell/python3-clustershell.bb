SUMMARY = "ClusterShell module for Python 3"
DESCRIPTION = "ClusterShell Python 3 module and related command line tools."
LICENSE = "LGPL-2.1-or-later"

PV = "1.9.1"

RPM_NAME = "python3-clustershell-1.9.1-1.1.noarch.rpm"
RPM_HASH = "637594b2399dad40ef7536a86c0df657315d12e0ca6492f80acccc1e062c502a215629ad4e542acd841836e39187e90e30bf12b268d1d3737ea5219530c40b6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-clustershell \
python3.10dist-clustershell \
python3dist-clustershell"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-PyYAML \
python3-setuptools"

inherit rpm
