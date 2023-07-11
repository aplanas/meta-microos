SUMMARY = "KDE PIM Libraries: Mailbox functionality"
DESCRIPTION = "This package contains the basic packages for KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "kmbox-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "06c3ecd93da7f6661290d2cafe812469b0cae98ee45c19260da413296c39da7a9801ea89365271fc89eb179b354d9dc8b42042511a1c1cd9ee7c12ce5ecbe568"

RPROVIDES:${PN} += "kmbox"

RDEPENDS:${PN} += ""

inherit rpm
