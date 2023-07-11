SUMMARY = "Python 3 bindings for libguestfs"
DESCRIPTION = "python3-libguestfs contains Python 3 bindings for libguestfs."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "python3-libguestfs-1.50.1-3.3.aarch64.rpm"
RPM_HASH = "706fc5f60ec6ef8aae35b3a8359adee40acb31fb148eade49774d0b19f5a5ec45136147ab8be66fb9763c7cd9a8eb7ad98c0a9079551f14533be8fc25cf86b37"

RPROVIDES:${PN} += "libguestfsmod.cpython-311-aarch64-linux-gnu.so \
python3-libguestfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libguestfs \
libguestfs.so.0 \
python-abi"

inherit rpm
