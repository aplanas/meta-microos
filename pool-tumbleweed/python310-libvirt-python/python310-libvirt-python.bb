SUMMARY = "Library providing a virtualization API"
DESCRIPTION = "The python-libvirt-python package contains a module that permits applications \
written in the Python programming language to use the interface \
supplied by the libvirt library to use the virtualization capabilities \
of recent versions of Linux (v2.6.20+)."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "python310-libvirt-python-9.4.0-1.3.aarch64.rpm"
RPM_HASH = "0d1f7759e64ccb60ae73b5caa89848cc3d1b642c8029ce4ea6700c5bea51aa894a30d4d38a03beda5b207e4c16443cc81b7c45bbbd7dee415de0606a3588e642"

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
