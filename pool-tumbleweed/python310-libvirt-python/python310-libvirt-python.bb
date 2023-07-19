SUMMARY = "Library providing a virtualization API"
DESCRIPTION = "The python-libvirt-python package contains a module that permits applications \
written in the Python programming language to use the interface \
supplied by the libvirt library to use the virtualization capabilities \
of recent versions of Linux (v2.6.20+)."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "python310-libvirt-python-9.5.0-1.1.aarch64.rpm"
RPM_HASH = "5ba04ec4f2b5978569376babd8d4218a197cce0c680fdde55dd618f27eb577e691e493f139a576b390fcb27de4cf78aabc4aa9e62d4542ca9ba7cf6919a1eb9a"

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
