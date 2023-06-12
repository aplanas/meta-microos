SUMMARY = "Matrix screensaver for vim"
DESCRIPTION = "Matrix screensaver for VIM, inspired by Chris Allegretta's cmatrix."
LICENSE = "MIT"

PV = "1.10"

RPM_NAME = "vim-plugin-matrix-1.10-55.1.noarch.rpm"
RPM_HASH = "c75483ac8524e28b551d3e50d3c1acd345efec3886bab841e7bde4fc9f15a081e3156ea3858b3ac30e44e1bbf686102f68fb63da51b745f6f6beb88a6323efdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-matrix"
RDEPENDS:${PN} += "vim"

inherit rpm
