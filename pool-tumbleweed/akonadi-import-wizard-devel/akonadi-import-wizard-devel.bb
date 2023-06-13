SUMMARY = "Development files for the PIM data import assistant"
DESCRIPTION = "This package contains development headers to build new import plugins for \
KDE PIM applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "akonadi-import-wizard-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "ee59030a4a3f12b8bee5e5b289a7fc349befc5c367f1b4179606c6d783646ba8a437328f5fc3f026f1e1f6043bd97f6deeed884d2108e7003faa6de4ca29af84"

RPROVIDES:${PN} += "akonadi-import-wizard-devel \
akonadi-import-wizard-devel(aarch-64) \
cmake(KPim5ImportWizard) \
cmake(KPimImportWizard)"

RDEPENDS:${PN} += "akonadi-import-wizard \
libKPim5ImportWizard5"

inherit rpm
