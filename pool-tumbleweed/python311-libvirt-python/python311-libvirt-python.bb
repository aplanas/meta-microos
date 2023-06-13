SUMMARY = "Library providing a virtualization API"
DESCRIPTION = "The python-libvirt-python package contains a module that permits applications \
written in the Python programming language to use the interface \
supplied by the libvirt library to use the virtualization capabilities \
of recent versions of Linux (v2.6.20+)."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "python311-libvirt-python-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "7d1e2f3d90c470d999715f6711f24000e76c6fe92b2f4c9b7a095b928f885f826eee4fff4f9b4312a5a4a916980a28bf99c1e376185663c0c78915c8a4d7c64c"

RPROVIDES:${PN} += "libvirtmod.cpython-311-aarch64-linux-gnu.so()(64bit) \
libvirtmod_lxc.cpython-311-aarch64-linux-gnu.so()(64bit) \
libvirtmod_qemu.cpython-311-aarch64-linux-gnu.so()(64bit) \
python3.11dist(libvirt-python) \
python311-libvirt-python \
python311-libvirt-python(aarch-64) \
python3dist(libvirt-python)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libvirt-lxc.so.0()(64bit) \
libvirt-qemu.so.0()(64bit) \
libvirt.so.0()(64bit) \
python(abi)"

inherit rpm
