SUMMARY = "Metapackage to pull in all of python-nautilus' packages"
DESCRIPTION = "This package contains files required to build wrappers for python-nautilus."
LICENSE = "GPL-2.0-or-later"

PV = "4.0"

RPM_NAME = "python310-nautilus-devel-4.0-2.1.aarch64.rpm"
RPM_HASH = "53f1b7e838d84a45c891e4e79676dc576365448f39e6b76bee537b172b0752d3c8c004ce0dd47fc769369c84e78ff08703b9138bab97ba178e2e8f457966a503"

RPROVIDES:${PN} += "python310-nautilus-devel"

RDEPENDS:${PN} += "python310-devel \
python310-nautilus \
python310-nautilus-common-devel"

inherit rpm
