SUMMARY = "Debuginfo dependencies for MicroOS installation-images"
DESCRIPTION = "Package that holds debuginfo dependencies for image files in installation-image."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "installation-images-debuginfodeps-MicroOS-17.91-1.88.aarch64.rpm"
RPM_HASH = "700f0c487f75206af810d20f142550b1f99e7f9d719185feff753a0a4a6c040f0b2e6c65bf201c58a3061b426748337653890aa744129a4fb035597cce7c8482"

RPROVIDES:${PN} += "debuginfo-build-id \
installation-images-debuginfodeps \
installation-images-debuginfodeps-MicroOS"

RDEPENDS:${PN} += "debuginfo-build-id"

inherit rpm
