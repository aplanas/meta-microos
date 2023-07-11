SUMMARY = "Documentation files for PIC MCUs"
DESCRIPTION = "Documentation for gputils and supported PIC MCUs."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.2"

RPM_NAME = "gputils-doc-1.5.2-1.5.noarch.rpm"
RPM_HASH = "c639efd63db2d6a5a9476f66a004a0057f62f806a0a5922cd6ab1c59018a1440b5c4fecc84289d5273c549611c69733acc48bb07123f800cbc1e1e187a851efa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gputils-doc"

RDEPENDS:${PN} += "gputils"

inherit rpm
