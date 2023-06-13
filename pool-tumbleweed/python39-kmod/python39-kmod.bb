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

RPM_NAME = "python39-kmod-0.9.1-3.16.aarch64.rpm"
RPM_HASH = "5ba867c3f530f68946d180c5cd97fb815abc9c416fa98759406f7c87a5eb9dfd0910ee8f0f146a2464b8921bbd93aedda79642d8c6f94ad33f12b5455505c0e3"

RPROVIDES:${PN} += "python3.9dist(kmod) \
python39-kmod \
python39-kmod(aarch-64) \
python3dist(kmod)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libkmod.so.2()(64bit) \
libkmod.so.2(LIBKMOD_5)(64bit) \
python(abi)"

inherit rpm
