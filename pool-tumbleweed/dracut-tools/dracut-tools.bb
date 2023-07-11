SUMMARY = "Tools to build a local initramfs"
DESCRIPTION = "This package contains tools to assemble the local initrd and host configuration."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "059+suse.447.g9d1fc722"

RPM_NAME = "dracut-tools-059+suse.447.g9d1fc722-1.1.aarch64.rpm"
RPM_HASH = "bf8a81aa469b1eae3b9ce812b2e0643458fda3b9d2a3feefbcccc19d735acf9d0b2978a09e04a40d1c2cc21b53359ba1f7a487710824adfb2de41d24dd451ec1"

RPROVIDES:${PN} += "dracut-/usr/bin/dracut-catimages \
dracut-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
dracut"

inherit rpm
