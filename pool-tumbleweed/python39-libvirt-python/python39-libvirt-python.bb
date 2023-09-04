SUMMARY = "Library providing a virtualization API"
DESCRIPTION = "The python-libvirt-python package contains a module that permits applications \
written in the Python programming language to use the interface \
supplied by the libvirt library to use the virtualization capabilities \
of recent versions of Linux (v2.6.20+)."
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "python39-libvirt-python-9.6.0-1.1.aarch64.rpm"
RPM_HASH = "c95178ba3fbf4bf20c9b851b302a694013954ff4733a7dcfe63685b20809d1a182f57c25fb576bfd50b61584be9cf5665558ba18262495ba6273f9e7dde8ee24"

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
