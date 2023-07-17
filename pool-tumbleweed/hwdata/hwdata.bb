SUMMARY = "Hardware identification and configuration data"
DESCRIPTION = "hwdata contains various hardware identification and configuration data, \
such as the pci.ids and usb.ids databases."
LICENSE = "GPL-2.0-or-later"

PV = "0.372"

RPM_NAME = "hwdata-0.372-1.1.noarch.rpm"
RPM_HASH = "756532edc036d99ac6da84dcadef80de31c913cf804c6a65569dfbbea1743677a013470a4c0a9270fb1e1f65473c2e5b45f2ab0a33e45de9a9f74d84968b47eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hwdata \
pciutils-ids \
pkgconfig-hwdata"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/pkg-config \
/usr/bin/sh \
coreutils \
perl"

inherit rpm
