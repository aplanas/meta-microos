SUMMARY = "Default configuration files for the libvirtd daemon"
DESCRIPTION = "Default configuration files for setting up NAT based networking"
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-config-network-9.5.0-2.1.aarch64.rpm"
RPM_HASH = "4c0f0799d3853fb5e5bcc52347280d7fc17d0c4a0fdb1facf940d636d9caadd42f5df54c0d4be83b16647b738a497befa44e46b961cc00af5fb048af807cd80c"

RPROVIDES:${PN} += "libvirt-daemon-config-network"

RDEPENDS:${PN} += "/usr/bin/sh \
libvirt-daemon-driver-network"

inherit rpm
