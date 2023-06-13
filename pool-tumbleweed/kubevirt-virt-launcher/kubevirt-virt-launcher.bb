SUMMARY = "Launcher component for kubevirt"
DESCRIPTION = "The virt-launcher package provides a launcher for kubevirt"
LICENSE = "Apache-2.0"

PV = "0.59.0"

RPM_NAME = "kubevirt-virt-launcher-0.59.0-3.2.aarch64.rpm"
RPM_HASH = "4ba6c1e1707d6803d40b406a6445a81d20cea2300c11a3631ae31dc5276931b81d32261afbb74b04dc41d21197da214dda882f90b73b667fc70ef2a98c89f2dc"

RPROVIDES:${PN} += "kubevirt-virt-launcher \
kubevirt-virt-launcher(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
libc.so.6()(64bit) \
libvirt-lxc.so.0()(64bit) \
libvirt-qemu.so.0()(64bit) \
libvirt.so.0()(64bit)"

inherit rpm
