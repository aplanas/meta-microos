SUMMARY = "Python 3 bindings for libguestfs"
DESCRIPTION = "python3-libguestfs contains Python 3 bindings for libguestfs."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "python3-libguestfs-1.50.1-3.1.aarch64.rpm"
RPM_HASH = "46416ba9cbbd6a0e33149bcbefc19c1e3493d8cf1217578c19650672ed6c1405a398be3e1120cbbce521ac77491a215984614d3994a823bc71a59ccd9b8b99ef"

RPROVIDES:${PN} += "libguestfsmod.cpython-310-aarch64-linux-gnu.so()(64bit) \
python3-libguestfs \
python3-libguestfs(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libguestfs \
libguestfs.so.0()(64bit) \
python(abi)"

inherit rpm
