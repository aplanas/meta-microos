SUMMARY = "Metapackage to pull in all of python-nautilus' packages"
DESCRIPTION = "This package contains files required to build wrappers for python-nautilus."
LICENSE = "GPL-2.0-or-later"

PV = "4.0"

RPM_NAME = "python310-nautilus-devel-4.0-1.5.aarch64.rpm"
RPM_HASH = "4a1af417aab920eeccb4416721a8c4abeb5d4618654dd52a4cfd91574525d8d3c509db7a000e393c9a6563320ebf8fcf01faea47e5e831dd50367e2f3f17f371"

RPROVIDES:${PN} += "python3-nautilus-devel \
python310-nautilus-devel \
python310-nautilus-devel(aarch-64)"

RDEPENDS:${PN} += "python310-devel \
python310-nautilus \
python310-nautilus-common-devel"

inherit rpm
