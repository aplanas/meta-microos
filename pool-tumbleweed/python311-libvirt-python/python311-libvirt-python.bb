SUMMARY = "Library providing a virtualization API"
DESCRIPTION = "The python-libvirt-python package contains a module that permits applications \
written in the Python programming language to use the interface \
supplied by the libvirt library to use the virtualization capabilities \
of recent versions of Linux (v2.6.20+)."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "python311-libvirt-python-9.4.0-1.3.aarch64.rpm"
RPM_HASH = "b9ee7b36abf8e37668a07acb78bca6948e1c91116a0ee18eb634462a3c8123ccf45d2eeb08ce26e766f75bc66758fa21b8f4de7c035676de4e20c05a08d84f2e"

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
