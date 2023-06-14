SUMMARY = "Documentation for qt6-wayland in QCH format"
DESCRIPTION = "This package contains documentation for qt6-wayland in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-wayland-docs-qch-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "3ef77b6a334460ab8607c4ba42a826eed3b0684eefbd43953b79811c45027b7490a224ed2eb8e045f7cbdb43b1fd337c981d3549a88c115e4a0fe88aeb1d157a"

RPROVIDES:${PN} += "qt6-wayland-docs-qch"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
