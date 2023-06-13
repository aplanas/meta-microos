SUMMARY = "Library providing a virtualization API"
DESCRIPTION = "The python-libvirt-python package contains a module that permits applications \
written in the Python programming language to use the interface \
supplied by the libvirt library to use the virtualization capabilities \
of recent versions of Linux (v2.6.20+)."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "python39-libvirt-python-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "2d121364ec120b1fd381c1e13a2c593be20ed8f008eab1ef4593b85169f5f5d9a2ce7449a56e655f597e83f447a7080675a9f4777a0378c93c82d616c66e7653"

RPROVIDES:${PN} += "libvirtmod.cpython-39-aarch64-linux-gnu.so()(64bit) \
libvirtmod_lxc.cpython-39-aarch64-linux-gnu.so()(64bit) \
libvirtmod_qemu.cpython-39-aarch64-linux-gnu.so()(64bit) \
python3.9dist(libvirt-python) \
python39-libvirt-python \
python39-libvirt-python(aarch-64) \
python3dist(libvirt-python)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libvirt-lxc.so.0()(64bit) \
libvirt-qemu.so.0()(64bit) \
libvirt.so.0()(64bit) \
python(abi)"

inherit rpm
