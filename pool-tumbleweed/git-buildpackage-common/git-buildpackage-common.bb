SUMMARY = "Common files for git-buildpackage debian and rpm tools"
DESCRIPTION = "Common files and documentation, used by both git-buildpackage debian and rpm tools"
LICENSE = "GPL-2.0-only"

PV = "0.9.23"

RPM_NAME = "git-buildpackage-common-0.9.23-1.2.noarch.rpm"
RPM_HASH = "841ad96516b71725875cad7cadf691cfbf94090f2674a70c21c1a629db182da2b6cec1f3fff4fa62b2b81c8eac88c240c5496f83a01103cf3d2dfde90aebd4e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(git-buildpackage-common) \
git-buildpackage-common \
python3.10dist(gbp) \
python3dist(gbp)"

RDEPENDS:${PN} += "/usr/bin/python3 \
git-core \
man \
python(abi) \
python3-base \
python3-dateutil \
python3-setuptools"

inherit rpm
