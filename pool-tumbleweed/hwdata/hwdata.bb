SUMMARY = "Hardware identification and configuration data"
DESCRIPTION = "hwdata contains various hardware identification and configuration data, \
such as the pci.ids and usb.ids databases."
LICENSE = "GPL-2.0-or-later"

PV = "0.371"

RPM_NAME = "hwdata-0.371-1.1.noarch.rpm"
RPM_HASH = "a0be103d08fc9ee22747813d80e8d4bcf00d805abeaf7ce1e894fb17400a0c1614a35c589363a442627d38fc1bd58313b5d1be1b42a97bb71c3eb0d3b6343fcf"
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
