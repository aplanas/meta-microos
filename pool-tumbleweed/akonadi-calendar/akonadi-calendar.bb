SUMMARY = "Akonadi calendar integration"
DESCRIPTION = "This library provides calendar integration for Akonadi based Applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "akonadi-calendar-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "5df0f1ca4ca9bc951808d5ab3b66308d44aaa482ec05bb123a8ad591277803429a5f3e0ea6ea0a7cd700794df117890ba44eeaa208d96e46957c50d21833805a"

RPROVIDES:${PN} += "akonadi-calendar"

RDEPENDS:${PN} += ""

inherit rpm
