SUMMARY = "Dracut modules to build a dracut initramfs with IMA"
DESCRIPTION = "This package requires everything which is needed to build an \
initramfs (using dracut) which tries to load an IMA policy during startup."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "059+suse.476.g5e324584"

RPM_NAME = "dracut-ima-059+suse.476.g5e324584-1.1.aarch64.rpm"
RPM_HASH = "301eb76cd4885d3cde9473a5c230f6fcbe2facc9b386c26c3633e27741799b45d979ad6de1bef469758564a0f1fc4038292e9344875d39d57b94440956ecfdbe"

RPROVIDES:${PN} += "config-dracut-ima \
dracut-ima"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
dracut \
evmctl \
keyutils"

inherit rpm
