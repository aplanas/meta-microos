SUMMARY = "Launcher component for kubevirt"
DESCRIPTION = "The virt-launcher package provides a launcher for kubevirt"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virt-launcher-1.0.0-7.1.aarch64.rpm"
RPM_HASH = "11404cac209e8f3bd813d688f1f53fc181b30bfeec468c5e805e4a8a181879ec942add7370939415ea5d930a0a1d32df5e550552ff4d7ad22e2ac8cefc2df301"

RPROVIDES:${PN} += "kubevirt-virt-launcher"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6 \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0"

inherit rpm
