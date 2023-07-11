SUMMARY = "Shared development files for python-nautilus"
DESCRIPTION = "This package contains common files required to build wrappers for \
python-nautilus in both Python2 and Python3."
LICENSE = "GPL-2.0-or-later"

PV = "4.0"

RPM_NAME = "python-nautilus-common-devel-4.0-2.1.aarch64.rpm"
RPM_HASH = "b5e90022d32a2818f8a19bfc4d3f6035afd0c50b151b36d7b3ac8f86e099255fbc5deb4d608eb05e716da9447d0cca115ce858fbc609abc4badd1a6e6d311595"

RPROVIDES:${PN} += "pkgconfig-nautilus-python \
python-nautilus-common-devel \
python310-nautilus-common-devel \
python311-nautilus-common-devel \
python39-nautilus-common-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
python3-nautilus-devel"

inherit rpm
