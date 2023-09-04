SUMMARY = "Hardware identification and configuration data"
DESCRIPTION = "hwdata contains various hardware identification and configuration data, \
such as the pci.ids and usb.ids databases."
LICENSE = "GPL-2.0-or-later"

PV = "0.373"

RPM_NAME = "hwdata-0.373-1.1.noarch.rpm"
RPM_HASH = "f21108cfb6038ffd53521760ee8d87f2038a23d6314245b5c667a6b59967bb50e42b8c4e0dcc981ae62edf3723bf1905f23062a238c074d033244bb4d74ce541"
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
