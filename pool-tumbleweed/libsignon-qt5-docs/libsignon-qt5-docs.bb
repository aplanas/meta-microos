SUMMARY = "Documentation for libsignon-qt1"
DESCRIPTION = "This package contains the documentation for the signon-qt library."
LICENSE = "LGPL-2.0-only"

PV = "8.61"

RPM_NAME = "libsignon-qt5-docs-8.61-1.1.noarch.rpm"
RPM_HASH = "c927d468efc9b117954b68d4eae47d0333343ce4657e47f8955748b35e535dea1a53478adb4c5b258a3b075f4fcfe189f0e721b3f0fa7c40df69e95ee7d64c15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libsignon-qt5-docs"

RDEPENDS:${PN} += ""

inherit rpm
