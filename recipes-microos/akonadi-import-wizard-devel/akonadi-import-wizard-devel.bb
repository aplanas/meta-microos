SUMMARY = "Development files for the PIM data import assistant"
DESCRIPTION = "This package contains development headers to build new import plugins for \
KDE PIM applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "akonadi-import-wizard-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "c31147f7acc9be2a3d6483e9acdd8f773fc98f2043d28953039eb7b7082d9bf43233422d3c0fad313d17c9601d04f52364789887749d95f034893c2d1c6a4326"

RPROVIDES:${PN} += "akonadi-import-wizard-devel akonadi-import-wizard-devel(aarch-64) cmake(KPim5ImportWizard) cmake(KPimImportWizard)"
RDEPENDS:${PN} += "akonadi-import-wizard libKPim5ImportWizard5"

inherit rpm
