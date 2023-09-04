SUMMARY = "Non-ABI stable API for the Qt 6 QuickTemplates2 library"
DESCRIPTION = "This package provides private headers of libQt6QuickTemplates2 that do not have \
any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-quicktemplates2-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "ce166a796469f4902241357e91a134f78701bd5e61723fa328ff1b9612a8c13462bd84b57344304429b1e09b56700db55aab985e508956f4ba3bc521617df757"

RPROVIDES:${PN} += "qt6-quicktemplates2-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickTemplates2 \
qt6-qmlmodels-private-devel"

inherit rpm
