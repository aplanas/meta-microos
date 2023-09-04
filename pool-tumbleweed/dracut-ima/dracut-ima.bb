SUMMARY = "Dracut modules to build a dracut initramfs with IMA"
DESCRIPTION = "This package requires everything which is needed to build an \
initramfs (using dracut) which tries to load an IMA policy during startup."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "059+suse.491.g87f19c22"

RPM_NAME = "dracut-ima-059+suse.491.g87f19c22-1.1.aarch64.rpm"
RPM_HASH = "e51f22690eabbcbb0c5954746843e9387ca9f05892a88e568b6cc119463461ea427ba7961c5590f38a4b2f7c06cffc0f98a324863e16d7150f39b5195762e5a8"

RPROVIDES:${PN} += "config-dracut-ima \
dracut-ima"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
dracut \
evmctl \
keyutils"

inherit rpm
