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

RPM_NAME = "ignition-2.16.2-1.1.aarch64.rpm"
RPM_HASH = "8490367c96f6a9ebd60c915181299fe49120354176c739b877e2d4bcc9f9b336a707ac379440abfbb366973b5b6f829d37e61d5d4a5d8757f405fbd7e3ad0974"

RPROVIDES:${PN} += "ignition \
ignition-dracut"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
dracut \
ignition-dracut-grub2 \
libblkid.so.1 \
libc.so.6"

inherit rpm
