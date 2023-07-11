SUMMARY = "Metapackage to pull in all of python-nautilus' packages"
DESCRIPTION = "This package contains files required to build wrappers for python-nautilus."
LICENSE = "GPL-2.0-or-later"

PV = "4.0"

RPM_NAME = "python311-nautilus-devel-4.0-2.1.aarch64.rpm"
RPM_HASH = "2a50dbc1a330c5fc32b982bf7ac8554f556e2ba4ff9c29579944b2272954df9e719ee7447cebceb58714dae37e77e710b842e72f4f99d016a4d9ba3f6e79daed"

RPROVIDES:${PN} += "python3-nautilus-devel \
python311-nautilus-devel"

RDEPENDS:${PN} += "python311-devel \
python311-nautilus \
python311-nautilus-common-devel"

inherit rpm
