SUMMARY = "KDE PIM libraries MIME support"
DESCRIPTION = "This package contains the basic packages for KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "kmime-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "98e648883ca86b2ed8c3e5bb594ffe322f34ddea3fd0852345a77df22368c07d21b0b97be5d900d8b72c05adeee5ddef9f1bd59aefdebe9ccbfd8115c4541708"

RPROVIDES:${PN} += "kmime"

RDEPENDS:${PN} += ""

inherit rpm
