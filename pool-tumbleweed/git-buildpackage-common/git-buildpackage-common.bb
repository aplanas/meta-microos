SUMMARY = "Common files for git-buildpackage debian and rpm tools"
DESCRIPTION = "Common files and documentation, used by both git-buildpackage debian and rpm tools"
LICENSE = "GPL-2.0-only"

PV = "0.9.23"

RPM_NAME = "git-buildpackage-common-0.9.23-1.3.noarch.rpm"
RPM_HASH = "6f7410185f250e3be04f9ecc3b419e13678d8f4d0be5630b037328428b2416486eee3d199ea46b6135afdf7dcd9dcd6a34d201b15430639e6b050c01796ecfcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-git-buildpackage-common \
git-buildpackage-common \
python3.11dist-gbp \
python3dist-gbp"

RDEPENDS:${PN} += "/usr/bin/python3 \
git-core \
man \
python-abi \
python3-base \
python3-dateutil \
python3-setuptools"

inherit rpm
