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

RPM_NAME = "python311-kmod-0.9.1-3.16.aarch64.rpm"
RPM_HASH = "fa5a430b0159ab3491d8cd993cdaf9d9591c0f40fdbb79c4fd570bbd1800cc0ac9ebd0e0472975a7f0cc0a30bd33b5c34e38120a651bc93a1e139989fba55251"

RPROVIDES:${PN} += "python3.11dist(kmod) \
python311-kmod \
python311-kmod(aarch-64) \
python3dist(kmod)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libkmod.so.2()(64bit) \
libkmod.so.2(LIBKMOD_5)(64bit) \
python(abi)"

inherit rpm
