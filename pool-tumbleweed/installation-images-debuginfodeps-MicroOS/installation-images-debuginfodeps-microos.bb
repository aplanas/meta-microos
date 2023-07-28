SUMMARY = "Debuginfo dependencies for MicroOS installation-images"
DESCRIPTION = "Package that holds debuginfo dependencies for image files in installation-image."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "installation-images-debuginfodeps-MicroOS-17.89-1.56.aarch64.rpm"
RPM_HASH = "30940019d6420e74eb98d7655d5a06b7db08203ced23d3d0f2fff4b84a6fa0d64785b51796305bc812bb8591bfbcdd0351989ef7ba600f6debcb3b58c800e7b9"

RPROVIDES:${PN} += "debuginfo-build-id \
installation-images-debuginfodeps \
installation-images-debuginfodeps-MicroOS"

RDEPENDS:${PN} += "debuginfo-build-id"

inherit rpm
