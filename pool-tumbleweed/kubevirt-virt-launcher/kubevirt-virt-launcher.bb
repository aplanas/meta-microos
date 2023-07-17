SUMMARY = "Launcher component for kubevirt"
DESCRIPTION = "The virt-launcher package provides a launcher for kubevirt"
LICENSE = "Apache-2.0"

PV = "0.59.2"

RPM_NAME = "kubevirt-virt-launcher-0.59.2-2.1.aarch64.rpm"
RPM_HASH = "24cd566a199e5920625d8bd3e44dd86440d383ff30f1db49976dea3eb6656bbfdca2bdb368e7ffbfa4bdb1e2bae3734274a0e35ad99b764cf45064d72517a7a9"

RPROVIDES:${PN} += "kubevirt-virt-launcher"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6 \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0"

inherit rpm
