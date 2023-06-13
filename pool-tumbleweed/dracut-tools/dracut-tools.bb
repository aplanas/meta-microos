SUMMARY = "Tools to build a local initramfs"
DESCRIPTION = "This package contains tools to assemble the local initrd and host configuration."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "059+suse.375.gafb362e4"

RPM_NAME = "dracut-tools-059+suse.375.gafb362e4-1.1.aarch64.rpm"
RPM_HASH = "fb7ebcbb9a98b62b55eed2081b420ea6c79754b0a898ad0cfb05fe202e3c8dd9e559ccbb58a3ca5fd3a55418bb321c5c97f2312b37a4ac7ca80a9938c468133c"

RPROVIDES:${PN} += "dracut-tools \
dracut-tools(aarch-64) \
dracut:/usr/bin/dracut-catimages"

RDEPENDS:${PN} += "/bin/bash \
dracut"

inherit rpm
