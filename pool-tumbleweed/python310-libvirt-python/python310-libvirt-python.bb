SUMMARY = "Library providing a virtualization API"
DESCRIPTION = "The python-libvirt-python package contains a module that permits applications \
written in the Python programming language to use the interface \
supplied by the libvirt library to use the virtualization capabilities \
of recent versions of Linux (v2.6.20+)."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "python310-libvirt-python-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "ae15b135dad1d8e0d8e0d84e345f30cb2aa0489430fd24a10da4bfc6be1b6cb6a6b20dfa73e3d8fc3d3fec7c68f7ffe386d5ac5498a903e01178f5d6f28822f3"

RPROVIDES:${PN} += "libvirtmod.cpython-310-aarch64-linux-gnu.so()(64bit) \
libvirtmod_lxc.cpython-310-aarch64-linux-gnu.so()(64bit) \
libvirtmod_qemu.cpython-310-aarch64-linux-gnu.so()(64bit) \
python3-libvirt-python \
python3.10dist(libvirt-python) \
python310-libvirt-python \
python310-libvirt-python(aarch-64) \
python3dist(libvirt-python)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libvirt-lxc.so.0()(64bit) \
libvirt-qemu.so.0()(64bit) \
libvirt.so.0()(64bit) \
python(abi)"

inherit rpm
