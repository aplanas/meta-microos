SUMMARY = "First boot installer and configuration tool"
DESCRIPTION = "Ignition is an utility to manipulate disks and configuration files \
during the initramfs. This includes partitioning disks, formatting \
partitions, writing files (regular files, systemd units, etc.), and \
creating users. \
On first boot, Ignition reads its configuration from a source of truth \
(remote URL, network metadata service, hypervisor bridge, etc.) and \
applies the configuration."
LICENSE = "Apache-2.0"

PV = "2.15.0"

RPM_NAME = "ignition-2.15.0-2.4.aarch64.rpm"
RPM_HASH = "c311f73b9ff82ce4a345d992dc921388d1c477820b7a774ea7fdf2cc039f01edaca1bb633b0c73416550cbca4b88fe3f559c05bf19189d0c28cc9fe25d6467d9"

RPROVIDES:${PN} += "ignition \
ignition(aarch-64) \
ignition-dracut"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
dracut \
ignition-dracut-grub2 \
libblkid.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
