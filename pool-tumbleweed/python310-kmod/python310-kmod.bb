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

RPM_NAME = "python310-kmod-0.9.1-4.1.aarch64.rpm"
RPM_HASH = "aca8cfacaaa17df65161071f201ce7c4a14cbfcce4962f9c9bf552fb329475e22a006b803d836f21cee81f747c8b8891fe9256a473f446501de1cc6f784b7332"

RPROVIDES:${PN} += "python3.10dist-kmod \
python310-kmod \
python3dist-kmod"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkmod.so.2 \
python-abi"

inherit rpm
