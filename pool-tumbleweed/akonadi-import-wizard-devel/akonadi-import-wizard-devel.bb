SUMMARY = "Development files for the PIM data import assistant"
DESCRIPTION = "This package contains development headers to build new import plugins for \
KDE PIM applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "akonadi-import-wizard-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "97709bc346ef97507e4a326262af1b904348269b06c6f9e5478a42cb3b6067134a0d30592c7dd466838841eb43d7a5c50154b703b9c408e61b2646adf82cc427"

RPROVIDES:${PN} += "akonadi-import-wizard-devel \
cmake-KPim5ImportWizard \
cmake-KPimImportWizard"

RDEPENDS:${PN} += "akonadi-import-wizard \
libKPim5ImportWizard5"

inherit rpm
