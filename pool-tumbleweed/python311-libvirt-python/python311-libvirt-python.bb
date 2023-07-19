SUMMARY = "Library providing a virtualization API"
DESCRIPTION = "The python-libvirt-python package contains a module that permits applications \
written in the Python programming language to use the interface \
supplied by the libvirt library to use the virtualization capabilities \
of recent versions of Linux (v2.6.20+)."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "python311-libvirt-python-9.5.0-1.1.aarch64.rpm"
RPM_HASH = "7d4c69155bd75de89c4f468fb39584ff1cb6988d70b986ce3fc9bcca97665f6b88e218afa66ec78258ecaea62acb1cf94a2401ed4f33db487dc55f062e2f5d26"

RPROVIDES:${PN} += "libvirtmod-lxc.cpython-311-aarch64-linux-gnu.so \
libvirtmod-qemu.cpython-311-aarch64-linux-gnu.so \
libvirtmod.cpython-311-aarch64-linux-gnu.so \
python3-libvirt-python \
python3.11dist-libvirt-python \
python311-libvirt-python \
python3dist-libvirt-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0 \
python-abi"

inherit rpm
