SUMMARY = "Documentation for qt6-quick3dphysics in QCH format"
DESCRIPTION = "This package contains documentation for qt6-quick3dphysics in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dphysics-docs-qch-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "b6e0caaa63282a79503039a68b5c6c90f53f8494e812fd1fb8e9a406b0a3a43bf21869ceb6e4433ebd0400cea25e9ae2cdec64bda7e91e048dac062ddc087a28"

RPROVIDES:${PN} += "qt6-quick3dphysics-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
