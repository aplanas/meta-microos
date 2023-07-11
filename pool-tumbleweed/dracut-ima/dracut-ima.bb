SUMMARY = "Dracut modules to build a dracut initramfs with IMA"
DESCRIPTION = "This package requires everything which is needed to build an \
initramfs (using dracut) which tries to load an IMA policy during startup."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "059+suse.447.g9d1fc722"

RPM_NAME = "dracut-ima-059+suse.447.g9d1fc722-1.1.aarch64.rpm"
RPM_HASH = "39e87ef955625e47c1b07fe6a3344ceaf366eb1d1d75bd79e5d5b432fbb2c88b73ea987aa1469fa7a2ad574b69e7e26fcc39667029ff585f291a956c3b068789"

RPROVIDES:${PN} += "config-dracut-ima \
dracut-ima"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
dracut \
evmctl \
keyutils"

inherit rpm
