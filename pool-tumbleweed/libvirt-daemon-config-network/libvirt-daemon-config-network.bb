SUMMARY = "Default configuration files for the libvirtd daemon"
DESCRIPTION = "Default configuration files for setting up NAT based networking"
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-config-network-9.4.0-3.1.aarch64.rpm"
RPM_HASH = "a39a3dfa79ca61cbfae0bd89486727e9cfe1f466aec1a5dcd1beb822c8158c605f8129ef514773fdf518c483e2346a40554d092a93bd2806c2e177777090d312"

RPROVIDES:${PN} += "libvirt-daemon-config-network"

RDEPENDS:${PN} += "/usr/bin/sh \
libvirt-daemon-driver-network"

inherit rpm
