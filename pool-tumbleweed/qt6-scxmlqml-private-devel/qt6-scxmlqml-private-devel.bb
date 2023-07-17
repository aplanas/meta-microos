SUMMARY = "Non-ABI stable API for the Qt 6 ScxmlQml library"
DESCRIPTION = "This package provides private headers of libQt6ScxmlQml that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-scxmlqml-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "be524136855b822229c2a3b3340a75628b4e7ad0ae9b30da07fb30c29966690abdce30219b11897807cafbbbdc79a41dbff7f86623cddd6f6edded5c97da5cef"

RPROVIDES:${PN} += "qt6-scxmlqml-private-devel"

RDEPENDS:${PN} += "cmake-Qt6ScxmlQml"

inherit rpm
