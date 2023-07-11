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

RPM_NAME = "ignition-2.15.0-2.5.aarch64.rpm"
RPM_HASH = "44e5ee7ef46bb50b9f76188c8c1d87da484b3a92c3fae446de9a58d3d5d93ca4c044de7bd2f76e6fd5fbef4f4cde5827ca4d503578cc2020b0f5cd920c916b02"

RPROVIDES:${PN} += "ignition \
ignition-dracut"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
dracut \
ignition-dracut-grub2 \
libblkid.so.1 \
libc.so.6"

inherit rpm
