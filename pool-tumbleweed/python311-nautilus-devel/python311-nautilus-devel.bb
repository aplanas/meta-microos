SUMMARY = "Metapackage to pull in all of python-nautilus' packages"
DESCRIPTION = "This package contains files required to build wrappers for python-nautilus."
LICENSE = "GPL-2.0-or-later"

PV = "4.0"

RPM_NAME = "python311-nautilus-devel-4.0-1.5.aarch64.rpm"
RPM_HASH = "a23d0e3d83ad02bf1f513d742886f7430250742408aa314f4b6ce54e02cf54a4d60a2ace404d73a7b42c12e0d1c86207fc9f6e719e0139ab74b4a41fb0805b08"

RPROVIDES:${PN} += "python311-nautilus-devel"

RDEPENDS:${PN} += "python311-devel \
python311-nautilus \
python311-nautilus-common-devel"

inherit rpm
