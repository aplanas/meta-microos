SUMMARY = "Python 3 bindings for libguestfs"
DESCRIPTION = "python3-libguestfs contains Python 3 bindings for libguestfs."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "python3-libguestfs-1.50.1-4.1.aarch64.rpm"
RPM_HASH = "bb5e2dcb7a84cf8e77e4e33c99faca01ca4bf91f6dcabb142e393aa0c3121268cf9713e8b8d445712f0bf4e4a1f9217fd2cd6e68ac35127a2ca0a210c8d689a2"

RPROVIDES:${PN} += "libguestfsmod.cpython-311-aarch64-linux-gnu.so \
python3-libguestfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libguestfs \
libguestfs.so.0 \
python-abi"

inherit rpm
