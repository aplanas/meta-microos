SUMMARY = "AppArmor profiles for Akonadi"
DESCRIPTION = "This package contains AppArmor profiles for Akonadi."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "akonadi-server-apparmor-23.04.0-2.1.aarch64.rpm"
RPM_HASH = "866969e8abb729d6cda76612fcf396af6549d5c2bf2fb62f62e4e5870068037b47b8f4863d673ab765ddbe67c82c60f24bfd840ade09803c4f85c895dbde1139"

RPROVIDES:${PN} += "akonadi-server-apparmor akonadi-server-apparmor(aarch-64) config(akonadi-server-apparmor)"
RDEPENDS:${PN} += "/bin/sh apparmor-abstractions"

inherit rpm
