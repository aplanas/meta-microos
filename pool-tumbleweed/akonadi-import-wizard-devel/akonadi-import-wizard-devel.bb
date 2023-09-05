SUMMARY = "Development files for the PIM data import assistant"
DESCRIPTION = "This package contains development headers to build new import plugins for \
KDE PIM applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "akonadi-import-wizard-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "8e659aa2ce5c601f18d1e7a8f6d3ba5d51b9638c7e17661d25229ed39684efc006a2162cd5c6c7b9b25f361eba1efd1f4fa4c37b69f1f25ea808a4467e22bb80"

RPROVIDES:${PN} += "akonadi-import-wizard-devel \
cmake-KPim5ImportWizard \
cmake-KPimImportWizard"

RDEPENDS:${PN} += "akonadi-import-wizard \
libKPim5ImportWizard5"

inherit rpm
