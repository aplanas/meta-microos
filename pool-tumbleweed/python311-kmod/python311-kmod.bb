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

RPM_NAME = "python311-kmod-0.9.1-3.18.aarch64.rpm"
RPM_HASH = "6955c943e64d5015bf322da36f5bcb152868119ac0a2fbc2807df716014e43f742cffbfaa6487ef40333ffe9ce5e57b2cc239997083cd415dfab9fb031c22789"

RPROVIDES:${PN} += "python3-kmod \
python3.11dist-kmod \
python311-kmod \
python3dist-kmod"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkmod.so.2 \
python-abi"

inherit rpm
