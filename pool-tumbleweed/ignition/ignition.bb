SUMMARY = "First boot installer and configuration tool"
DESCRIPTION = "Ignition is an utility to manipulate disks and configuration files \
during the initramfs. This includes partitioning disks, formatting \
partitions, writing files (regular files, systemd units, etc.), and \
creating users. \
On first boot, Ignition reads its configuration from a source of truth \
(remote URL, network metadata service, hypervisor bridge, etc.) and \
applies the configuration."
LICENSE = "Apache-2.0"

PV = "2.16.2"

RPM_NAME = "ignition-2.16.2-3.1.aarch64.rpm"
RPM_HASH = "6c54a4f8020ddf9a284c98f81ee4b155b0f7659cbcf7db08c51f3bb7e3794ec514bb1f8762ca8f99fd26a4eff4c0b716a4434bbf11ee13cf448256493944c8a8"

RPROVIDES:${PN} += "ignition \
ignition-dracut"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
combustion \
dracut \
libblkid.so.1 \
libc.so.6"

inherit rpm
