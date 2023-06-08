SUMMARY = "Akonadi calendar integration"
DESCRIPTION = "This library provides calendar integration for Akonadi based Applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "akonadi-calendar-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "7e8cad47c2436a799df3238ff238069f3057999c7e2b00b43d71c918583140b0f1c702fdc355b9a16b0d4cd804ac00641e525f3cafec73d0d5d8da92b696ea60"

RPROVIDES:${PN} += "akonadi-calendar akonadi-calendar(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
