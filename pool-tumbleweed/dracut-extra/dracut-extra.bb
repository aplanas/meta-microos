SUMMARY = "Dracut modules usually not required for normal operation"
DESCRIPTION = "This package contains all modules that are part of dracut upstream \
but are not normally supported or required."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "059+suse.476.g5e324584"

RPM_NAME = "dracut-extra-059+suse.476.g5e324584-1.1.aarch64.rpm"
RPM_HASH = "9871995f4fbdb08886bb48911f9362bc2d89e057d2360fcddfb91cfd68477924bb451ffd5ef2d26e95d994fca7a621ef09674661ffc6242940d4288d0e1eaf1e"

RPROVIDES:${PN} += "dracut-extra"

RDEPENDS:${PN} += "/usr/bin/bash \
dracut \
evmctl \
keyutils"

inherit rpm
