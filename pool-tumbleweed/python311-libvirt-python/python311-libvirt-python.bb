SUMMARY = "Library providing a virtualization API"
DESCRIPTION = "The python-libvirt-python package contains a module that permits applications \
written in the Python programming language to use the interface \
supplied by the libvirt library to use the virtualization capabilities \
of recent versions of Linux (v2.6.20+)."
LICENSE = "LGPL-2.1-or-later"

PV = "9.7.0"

RPM_NAME = "python311-libvirt-python-9.7.0-1.1.aarch64.rpm"
RPM_HASH = "395a3f17d2b5790a55acd2ed4eba1ab558c7b466c35e80ef69289099a1c29d8acc5cc718221e13866cde31cb2d5b1620d1a1240cccd19afefbdb2fb9c2e96a62"

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
