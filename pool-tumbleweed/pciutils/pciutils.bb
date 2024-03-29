SUMMARY = "PCI utilities for the Linux Kernel"
DESCRIPTION = "lspci: This program displays detailed information about all PCI busses \
and devices in the system, replacing the original /proc/pci interface. \
 \
setpci: This program allows reading from and writing to PCI device \
configuration registers. For example, you can adjust the latency timers \
with it. \
 \
update-pciids: This program downloads the current version of the \
pci.ids file."
LICENSE = "GPL-2.0-or-later"

PV = "3.10.0"

RPM_NAME = "pciutils-3.10.0-1.1.aarch64.rpm"
RPM_HASH = "2cb3b128bb3c40a4b97368811c8a85d4dba4beec8738e5fdf9de631e45c080e2d85c4c8861f1d20b75c34a2cd8479949c07eaf3d8d4b15eb79ac5bb338843f87"

RPROVIDES:${PN} += "pciutils"

RDEPENDS:${PN} += "hwdata \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkmod.so.2 \
libpci.so.3"

inherit rpm
