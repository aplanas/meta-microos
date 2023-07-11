SUMMARY = "AppArmor profiles for Akonadi"
DESCRIPTION = "This package contains AppArmor profiles for Akonadi."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "akonadi-server-apparmor-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "cfa7a4dac11a778aa3d4ab69ca0042842bc067f91e68e4aceeaa12a47cd2d864bac3c6c5962ec49e424b81914119d93184b5b7efab024bf5d610a65e61f1af4a"

RPROVIDES:${PN} += "akonadi-server-apparmor \
config-akonadi-server-apparmor"

RDEPENDS:${PN} += "/usr/bin/sh \
apparmor-abstractions"

inherit rpm
