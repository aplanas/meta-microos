SUMMARY = "System user for the flatpak system helper"
DESCRIPTION = "System user for the flatpak system helper."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.4"

RPM_NAME = "system-user-flatpak-1.14.4-1.2.noarch.rpm"
RPM_HASH = "758691d83f7db07c84668b80a62f645d49c94a4b634e9ae68334d94760454972b1253e78804beb7b317d53e07fa05c2b4b408e79422d01a7c60dd2c491b63a25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-flatpak \
system-user-flatpak \
user-flatpak"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
