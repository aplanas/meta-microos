SUMMARY = "Debuginfo dependencies for openSUSE installation-images"
DESCRIPTION = "Package that holds debuginfo dependencies for image files in installation-image."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "installation-images-debuginfodeps-openSUSE-17.91-1.84.aarch64.rpm"
RPM_HASH = "02d537d6cbadb8ed25c3a3096c61a5bf8ef84543120a13302f20a243a84c0f0f994120ab8e0093919f2c88114ffebb1f6a2956cdf850cb0920290c8288a02cd7"

RPROVIDES:${PN} += "debuginfo-build-id \
installation-images-debuginfodeps \
installation-images-debuginfodeps-openSUSE"

RDEPENDS:${PN} += "debuginfo-build-id"

inherit rpm
