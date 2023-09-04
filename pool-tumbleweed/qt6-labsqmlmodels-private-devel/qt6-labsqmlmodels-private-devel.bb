SUMMARY = "Non-ABI stable API for the Qt 6 LabsQmlModels library"
DESCRIPTION = "This package provides private headers of libQt6LabsQmlModels that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-labsqmlmodels-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "f23ab1c69a7f47697742761f544f9e182a19720e26eb24392517a17abbd1be07e9810e2c826432ad9d18eb189854093dfdebd40bcc36ce1dfaa152ed87feb644"

RPROVIDES:${PN} += "qt6-labsqmlmodels-private-devel"

RDEPENDS:${PN} += "cmake-Qt6LabsQmlModels"

inherit rpm
