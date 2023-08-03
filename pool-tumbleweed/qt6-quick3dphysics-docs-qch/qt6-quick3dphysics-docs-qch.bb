SUMMARY = "Documentation for qt6-quick3dphysics in QCH format"
DESCRIPTION = "This package contains documentation for qt6-quick3dphysics in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-quick3dphysics-docs-qch-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "bdb8ddf78e720f9b2b3b9e5060dcb11f7912f1e26dbf5f943a99bc7df25534cdc0351acfdd37d5fbe95c0d6c76666d590d0060e6a04f3f9832040ebb1b5c0b92"

RPROVIDES:${PN} += "qt6-quick3dphysics-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
