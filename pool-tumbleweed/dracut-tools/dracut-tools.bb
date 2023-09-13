SUMMARY = "Tools to build a local initramfs"
DESCRIPTION = "This package contains tools to assemble the local initrd and host configuration."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "059+suse.497.ga7feaf12"

RPM_NAME = "dracut-tools-059+suse.497.ga7feaf12-1.1.aarch64.rpm"
RPM_HASH = "bd5f7f0b4d16908809a003136b7f9d11f55bc66585b7e82ddab5dad32676555933df5594b5f3c9f91b4f433090348cfcd46e8687c787d10e1beb48e3b4453d85"

RPROVIDES:${PN} += "dracut-/usr/bin/dracut-catimages \
dracut-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
dracut"

inherit rpm
