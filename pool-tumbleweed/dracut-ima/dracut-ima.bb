SUMMARY = "Dracut modules to build a dracut initramfs with IMA"
DESCRIPTION = "This package requires everything which is needed to build an \
initramfs (using dracut) which tries to load an IMA policy during startup."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "059+suse.375.gafb362e4"

RPM_NAME = "dracut-ima-059+suse.375.gafb362e4-1.1.aarch64.rpm"
RPM_HASH = "3b0c7c0021d4a2d12f3e69b1cb3bb0138d86b0e9429666ecfbaa55775bf514766041b036054a20a9801ef478ce0cdfd0344c19e5f26980b242731520d213a683"

RPROVIDES:${PN} += "config(dracut-ima) \
dracut-ima \
dracut-ima(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
dracut \
evmctl \
keyutils"

inherit rpm
