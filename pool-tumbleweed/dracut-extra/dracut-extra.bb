SUMMARY = "Dracut modules usually not required for normal operation"
DESCRIPTION = "This package contains all modules that are part of dracut upstream \
but are not normally supported or required."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "059+suse.447.g9d1fc722"

RPM_NAME = "dracut-extra-059+suse.447.g9d1fc722-1.1.aarch64.rpm"
RPM_HASH = "9aba74406b3619e551dc2108516b157532f5885824a05ccfa00daa44c53be904754fd8f8bfa23ed9ce2c4afb111de9bebc5531fab0beb05f0e2721f390c9f8e7"

RPROVIDES:${PN} += "dracut-extra"

RDEPENDS:${PN} += "/usr/bin/bash \
dracut \
evmctl \
keyutils"

inherit rpm
