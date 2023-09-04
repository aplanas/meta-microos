SUMMARY = "Library providing a virtualization API"
DESCRIPTION = "The python-libvirt-python package contains a module that permits applications \
written in the Python programming language to use the interface \
supplied by the libvirt library to use the virtualization capabilities \
of recent versions of Linux (v2.6.20+)."
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "python311-libvirt-python-9.6.0-1.1.aarch64.rpm"
RPM_HASH = "a33832416933c2acfa689128939f7a490d3f028d6b87f6f1c049cffe8075629c27a74990464dbba8622951c4ac58f0a52e0bc38e3e0d1ff28666e9e6c4ae43ed"

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
