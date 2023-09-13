SUMMARY = "Library providing a virtualization API"
DESCRIPTION = "The python-libvirt-python package contains a module that permits applications \
written in the Python programming language to use the interface \
supplied by the libvirt library to use the virtualization capabilities \
of recent versions of Linux (v2.6.20+)."
LICENSE = "LGPL-2.1-or-later"

PV = "9.7.0"

RPM_NAME = "python39-libvirt-python-9.7.0-1.1.aarch64.rpm"
RPM_HASH = "2f65902601155cce2010bbce9ba7269f72ae3b03ee2fe575b58e0e736cc6282e9145f5d4e7b2acf83597214cb479eacabc032f3aa0f7df2386e7c07d13d4f886"

RPROVIDES:${PN} += "libvirtmod-lxc.cpython-39-aarch64-linux-gnu.so \
libvirtmod-qemu.cpython-39-aarch64-linux-gnu.so \
libvirtmod.cpython-39-aarch64-linux-gnu.so \
python3.9dist-libvirt-python \
python39-libvirt-python \
python3dist-libvirt-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0 \
python-abi"

inherit rpm
