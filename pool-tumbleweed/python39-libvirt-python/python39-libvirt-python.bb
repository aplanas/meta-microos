SUMMARY = "Library providing a virtualization API"
DESCRIPTION = "The python-libvirt-python package contains a module that permits applications \
written in the Python programming language to use the interface \
supplied by the libvirt library to use the virtualization capabilities \
of recent versions of Linux (v2.6.20+)."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "python39-libvirt-python-9.4.0-1.3.aarch64.rpm"
RPM_HASH = "587f93f5c3f9f517346661a49e5ba60ea55c627d2b6a0891743b3c9a14b959b1819a05005ede2f1de11df797acd5ba0b0752d9066efd266ef93873785dd8f680"

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
