SUMMARY = "Launcher component for kubevirt"
DESCRIPTION = "The virt-launcher package provides a launcher for kubevirt"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virt-launcher-1.0.0-3.1.aarch64.rpm"
RPM_HASH = "60df670b3f6701714a2b565176d760ba8bda9c187095fda015cb865a4afc3a89030d03b81280faa558aa052e963c2106ae45a3e0741e99589a40a145f52f5760"

RPROVIDES:${PN} += "kubevirt-virt-launcher"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6 \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0"

inherit rpm
