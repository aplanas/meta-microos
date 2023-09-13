SUMMARY = "Dracut modules to build a dracut initramfs with IMA"
DESCRIPTION = "This package requires everything which is needed to build an \
initramfs (using dracut) which tries to load an IMA policy during startup."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "059+suse.497.ga7feaf12"

RPM_NAME = "dracut-ima-059+suse.497.ga7feaf12-1.1.aarch64.rpm"
RPM_HASH = "2f1eafda7dffd9d851a6a19902f29a526b2f1552fbbd8d13ff9581bbe5e46081013e81624e42e7064ae4aba830108724e5f4d0a3feae1f24e5785f45b8ae6429"

RPROVIDES:${PN} += "config-dracut-ima \
dracut-ima"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
dracut \
evmctl \
keyutils"

inherit rpm
