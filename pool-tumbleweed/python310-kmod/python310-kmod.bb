SUMMARY = "Python module to work with kernel modules"
DESCRIPTION = "Python bindings for kmod/libkmod \
 \
kmod is a set of tools to handle common tasks with Linux kernel modules like \
insert, remove, list, check properties, resolve dependencies and aliases. \
 \
These tools are designed on top of libkmod, a library that is shipped with \
kmod. It can be found at: \
 \
http://git.kernel.org/?p=utils/kernel/kmod/kmod.git;a=summary \
 \
python-kmod is a Python wrapper module for libkmod, exposing common module \
operations: listing installed modules, modprobe, and rmmod."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.1"

RPM_NAME = "python310-kmod-0.9.1-3.16.aarch64.rpm"
RPM_HASH = "c757ef27fb4f708cf08a6feefe3875fbecdb7f73df25b020b60c1a2e4be4bca3b804f2573546a933eae3699aaaa8d2e717db9e3fadb00e3efcccb47eb85f2342"

RPROVIDES:${PN} += "python3-kmod \
python3.10dist(kmod) \
python310-kmod \
python310-kmod(aarch-64) \
python3dist(kmod)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libkmod.so.2()(64bit) \
libkmod.so.2(LIBKMOD_5)(64bit) \
python(abi)"

inherit rpm
