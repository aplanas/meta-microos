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

RPM_NAME = "python39-kmod-0.9.1-3.18.aarch64.rpm"
RPM_HASH = "60ce71c8f4634160527ed82bb7abdaf726bac107b5bcc6bbf543c5175d26afb1cb026a6e174ee16d8c7fd86dc5cc9adc836cff5bcb83500794fc492981e09292"

RPROVIDES:${PN} += "python3.9dist-kmod \
python39-kmod \
python3dist-kmod"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkmod.so.2 \
python-abi"

inherit rpm
