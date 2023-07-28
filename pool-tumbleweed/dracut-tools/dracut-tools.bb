SUMMARY = "Tools to build a local initramfs"
DESCRIPTION = "This package contains tools to assemble the local initrd and host configuration."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "059+suse.476.g5e324584"

RPM_NAME = "dracut-tools-059+suse.476.g5e324584-1.1.aarch64.rpm"
RPM_HASH = "917f365c74eedfa2b5a1399090d2e5efa2eca987cfe600ec80d22e5a876d01fb7dd950bd05b099d818d6ae039eecd7417fa35a8e5b5ae83ea2d84c78c9932555"

RPROVIDES:${PN} += "dracut-/usr/bin/dracut-catimages \
dracut-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
dracut"

inherit rpm
