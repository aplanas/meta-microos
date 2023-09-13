SUMMARY = "Default configuration files for the libvirtd daemon"
DESCRIPTION = "Default configuration files for setting up NAT based networking"
LICENSE = "LGPL-2.1-or-later"

PV = "9.7.0"

RPM_NAME = "libvirt-daemon-config-network-9.7.0-1.1.aarch64.rpm"
RPM_HASH = "f9a28f4b79c22cad24d94f7d6bbb4cd5ee87ddf7ab85a9cf48afe1f54a6dcb7c36f1752c9a3e806e4ac42608c6ff2726860c2a9694bdb8cc3fbad2cd6540788e"

RPROVIDES:${PN} += "libvirt-daemon-config-network"

RDEPENDS:${PN} += "/usr/bin/sh \
libvirt-daemon-driver-network"

inherit rpm
