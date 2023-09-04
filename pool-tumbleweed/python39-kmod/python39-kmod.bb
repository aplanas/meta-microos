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

RPM_NAME = "python39-kmod-0.9.1-4.1.aarch64.rpm"
RPM_HASH = "ab245423d17dc6ef56c05de3e375c105f678f8fdb4e84451093ffcbd8896757d9120d1fa1a5efb0e78c2a391e4d64f4edd31608971f8dea3e99923d139e3ada6"

RPROVIDES:${PN} += "python3.9dist-kmod \
python39-kmod \
python3dist-kmod"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkmod.so.2 \
python-abi"

inherit rpm
