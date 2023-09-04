SUMMARY = "Dracut modules usually not required for normal operation"
DESCRIPTION = "This package contains all modules that are part of dracut upstream \
but are not normally supported or required."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "059+suse.491.g87f19c22"

RPM_NAME = "dracut-extra-059+suse.491.g87f19c22-1.1.aarch64.rpm"
RPM_HASH = "8af715b0677e5a868e7ebe39251a13a70c2487fc2199a0026e41d9c04029b641f31b709900d7be2f9a7cd1e3945e5306190538f4b613d5fda45ee3107fe71c90"

RPROVIDES:${PN} += "dracut-extra"

RDEPENDS:${PN} += "/usr/bin/bash \
dracut \
evmctl \
keyutils"

inherit rpm
