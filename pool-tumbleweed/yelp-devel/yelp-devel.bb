SUMMARY = "Development files for libyelp"
DESCRIPTION = "Yelp is the help viewer in GNOME (it's what happens when you press F1). With \
gnome-doc-utils, Yelp serves as a DocBook viewer, a man page viewer and an \
info page viewer. \
 \
This package provides Yelp's development files."
LICENSE = "GPL-2.0-or-later"

PV = "42.2"

RPM_NAME = "yelp-devel-42.2-1.3.aarch64.rpm"
RPM_HASH = "cfe5bf39b8811ecda5576f9601bb8e9e53fb24c6b084a4d1951b68aabf95c8c2021e4a8ee44965175d6953da47e381a44525546fef907a2808f084a107848879"

RPROVIDES:${PN} += "yelp-devel"

RDEPENDS:${PN} += "libyelp0 \
yelp"

inherit rpm
