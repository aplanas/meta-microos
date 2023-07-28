SUMMARY = "Matrix screensaver for vim"
DESCRIPTION = "Matrix screensaver for VIM, inspired by Chris Allegretta's cmatrix."
LICENSE = "MIT"

PV = "1.10"

RPM_NAME = "vim-plugin-matrix-1.10-56.1.noarch.rpm"
RPM_HASH = "4fef176007378b2ec283b4d85c52f992d11987dbae4432d81b39e4b5da4d8d17ecf6c7a6bbfc634d9b01af04fad135590bd59abfdf8e7339d088d36a4cb18ca6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-matrix"

RDEPENDS:${PN} += "vim"

inherit rpm
