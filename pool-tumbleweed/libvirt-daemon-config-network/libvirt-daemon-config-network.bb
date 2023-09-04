SUMMARY = "Default configuration files for the libvirtd daemon"
DESCRIPTION = "Default configuration files for setting up NAT based networking"
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-daemon-config-network-9.6.0-2.1.aarch64.rpm"
RPM_HASH = "183c562c78b16aad1f1dfb19c813f7379c8a0bda5c0f7f4760219b0d9ea4973b8328479e0fe40e6bd37fc0f6d05cd5e683edba4d6b61c67d5e9558f3c4db160c"

RPROVIDES:${PN} += "libvirt-daemon-config-network"

RDEPENDS:${PN} += "/usr/bin/sh \
libvirt-daemon-driver-network"

inherit rpm
