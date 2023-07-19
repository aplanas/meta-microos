SUMMARY = "Library providing a virtualization API"
DESCRIPTION = "The python-libvirt-python package contains a module that permits applications \
written in the Python programming language to use the interface \
supplied by the libvirt library to use the virtualization capabilities \
of recent versions of Linux (v2.6.20+)."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "python39-libvirt-python-9.5.0-1.1.aarch64.rpm"
RPM_HASH = "0bcfb8795939e2a5e3b69d34a4f98939184ae9a21a30e00c79710bebf07b73d239aa6a556e604058d33ba80493f26352a410c3f8429356b7bd4aa8d03c3e2069"

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
