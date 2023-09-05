SUMMARY = "Default configuration files for the libvirtd daemon"
DESCRIPTION = "Default configuration files for setting up NAT based networking"
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-daemon-config-network-9.6.0-3.1.aarch64.rpm"
RPM_HASH = "eb0b26c49e01204cd30bc2d937306dcf251d2b1cc8bfe32e8e4ac11c8fc078bb6adda2935d620ce9aa2b684649cd968f3b1703861bef7c4defc742076b35fc84"

RPROVIDES:${PN} += "libvirt-daemon-config-network"

RDEPENDS:${PN} += "/usr/bin/sh \
libvirt-daemon-driver-network"

inherit rpm
