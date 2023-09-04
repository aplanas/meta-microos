SUMMARY = "Debuginfo dependencies for MicroOS installation-images"
DESCRIPTION = "Package that holds debuginfo dependencies for image files in installation-image."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "installation-images-debuginfodeps-MicroOS-17.91-1.66.aarch64.rpm"
RPM_HASH = "ccd17166bb156c232e42771ef32de7a635d952b7ab643cf5f96aba25af8af3dfecfbf16e5f67da70679ce97515a87f38a5a37f7655b13e627fc63732e4e577f0"

RPROVIDES:${PN} += "debuginfo-build-id \
installation-images-debuginfodeps \
installation-images-debuginfodeps-MicroOS"

RDEPENDS:${PN} += "debuginfo-build-id"

inherit rpm
