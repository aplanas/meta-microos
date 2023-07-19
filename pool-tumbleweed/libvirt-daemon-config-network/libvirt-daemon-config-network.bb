SUMMARY = "Default configuration files for the libvirtd daemon"
DESCRIPTION = "Default configuration files for setting up NAT based networking"
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-config-network-9.5.0-1.1.aarch64.rpm"
RPM_HASH = "523cb68aac543787e2b411482e097f40245c4af9c3377b188031a916b2f8646edf83b2c226ef79f0c8ade26f98183ff92f54529411d93fc257e8c82233094f1e"

RPROVIDES:${PN} += "libvirt-daemon-config-network"

RDEPENDS:${PN} += "/usr/bin/sh \
libvirt-daemon-driver-network"

inherit rpm
