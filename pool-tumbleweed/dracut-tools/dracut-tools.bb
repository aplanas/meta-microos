SUMMARY = "Tools to build a local initramfs"
DESCRIPTION = "This package contains tools to assemble the local initrd and host configuration."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "059+suse.491.g87f19c22"

RPM_NAME = "dracut-tools-059+suse.491.g87f19c22-1.1.aarch64.rpm"
RPM_HASH = "f61874efa73d8cdd2c4c7f4f05c6b3a757e584b96070494d38447869f0e0e0cc3ed751ed4d7ec5430163962c0b65db93511d8d444042dddf6b7d1372946b6162"

RPROVIDES:${PN} += "dracut-/usr/bin/dracut-catimages \
dracut-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
dracut"

inherit rpm
