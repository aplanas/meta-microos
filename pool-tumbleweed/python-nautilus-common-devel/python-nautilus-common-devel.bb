SUMMARY = "Shared development files for python-nautilus"
DESCRIPTION = "This package contains common files required to build wrappers for \
python-nautilus in both Python2 and Python3."
LICENSE = "GPL-2.0-or-later"

PV = "4.0"

RPM_NAME = "python-nautilus-common-devel-4.0-1.5.aarch64.rpm"
RPM_HASH = "fa4f285ad34ea0c695411759e6614784da9dc06f500d8e43ef60d97f02b8d2ab4d6d30bc9912bc99af0b230259e05295433ca072d2a04d2a7358f8bf3f98cdd4"

RPROVIDES:${PN} += "pkgconfig-nautilus-python \
python-nautilus-common-devel \
python310-nautilus-common-devel \
python311-nautilus-common-devel \
python39-nautilus-common-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
python3-nautilus-devel"

inherit rpm
