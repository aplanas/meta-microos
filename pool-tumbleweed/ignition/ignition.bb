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

RPM_NAME = "ignition-2.16.2-2.1.aarch64.rpm"
RPM_HASH = "4073d87d4b22231be1370e16c1c8b41af7cf44a04b9aac18b54610db321852b9a1b9922c9cb3fb689d8b17d25b64d4bc95666f5985384a8cabe0a13b7dc4b41c"

RPROVIDES:${PN} += "ignition \
ignition-dracut"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
combustion \
dracut \
libblkid.so.1 \
libc.so.6"

inherit rpm
