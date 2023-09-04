SUMMARY = "Library providing a virtualization API"
DESCRIPTION = "The python-libvirt-python package contains a module that permits applications \
written in the Python programming language to use the interface \
supplied by the libvirt library to use the virtualization capabilities \
of recent versions of Linux (v2.6.20+)."
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "python310-libvirt-python-9.6.0-1.1.aarch64.rpm"
RPM_HASH = "ae34e9ce65127894020cb187b86f454ef0b0f3fcc994ab03acc0083f3b5442d008ea498713f734084606b82292edbaeb7684ebc06d59d5468560bdd9218bafed"

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
