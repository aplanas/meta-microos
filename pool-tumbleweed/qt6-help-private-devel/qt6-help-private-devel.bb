SUMMARY = "Non-ABI stable API for the Qt 6 Help library"
DESCRIPTION = "This package provides private headers of libQt6Help that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.2"

RPM_NAME = "qt6-help-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "31955fd304d92602905a7afce1f6d6f170b7751900f783dc7a2733de4d4c2fc758c4150d03380f684fdcf2bef110776137134761510ac63429edfa6972782715"

RPROVIDES:${PN} += "qt6-help-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Help \
qt6-core-private-devel"

inherit rpm
