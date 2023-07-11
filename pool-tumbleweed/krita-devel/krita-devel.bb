SUMMARY = "Krita Build Environment"
DESCRIPTION = "Development headers and libraries for Krita."
LICENSE = "BSD-2-Clause & GPL-2.0-or-later & LGPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & CC0-1.0 & LGPL-2.0-only"

PV = "5.1.5"

RPM_NAME = "krita-devel-5.1.5-2.1.aarch64.rpm"
RPM_HASH = "e57ef8f3611608ed0e941ead6b42b78bb0dfbe3f640926a8a19641661959eeed2be68af91b1f7247365a7bf4b8ac5bc328a38f58d5bf0b21078c3bea58a4f51b"

RPROVIDES:${PN} += "krita-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
krita"

inherit rpm
