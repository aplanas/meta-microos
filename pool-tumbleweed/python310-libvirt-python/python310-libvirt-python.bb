SUMMARY = "Library providing a virtualization API"
DESCRIPTION = "The python-libvirt-python package contains a module that permits applications \
written in the Python programming language to use the interface \
supplied by the libvirt library to use the virtualization capabilities \
of recent versions of Linux (v2.6.20+)."
LICENSE = "LGPL-2.1-or-later"

PV = "9.7.0"

RPM_NAME = "python310-libvirt-python-9.7.0-1.1.aarch64.rpm"
RPM_HASH = "9753a8f9e06e7ab2d2f5923c1a0299406c28f5b872b746dc62f26ab3a13c181199866f0750fa87a4d83cbe789d7236a3f7958fe6b8c4a1e29b55b5a37f2cd4e1"

RPROVIDES:${PN} += "libvirtmod-lxc.cpython-310-aarch64-linux-gnu.so \
libvirtmod-qemu.cpython-310-aarch64-linux-gnu.so \
libvirtmod.cpython-310-aarch64-linux-gnu.so \
python3.10dist-libvirt-python \
python310-libvirt-python \
python3dist-libvirt-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0 \
python-abi"

inherit rpm
