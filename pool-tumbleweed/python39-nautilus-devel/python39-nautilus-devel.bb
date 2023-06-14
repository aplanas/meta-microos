SUMMARY = "Metapackage to pull in all of python-nautilus' packages"
DESCRIPTION = "This package contains files required to build wrappers for python-nautilus."
LICENSE = "GPL-2.0-or-later"

PV = "4.0"

RPM_NAME = "python39-nautilus-devel-4.0-1.5.aarch64.rpm"
RPM_HASH = "b17b9b9df30a94e9b02d044b3159e235d261ccf7846b4e44523bed40e75f1c07f8cdbf60a64c62241ca0b4d803b5902adc6e898c706885d532b2384e33aa6797"

RPROVIDES:${PN} += "python39-nautilus-devel"

RDEPENDS:${PN} += "python39-devel \
python39-nautilus \
python39-nautilus-common-devel"

inherit rpm
