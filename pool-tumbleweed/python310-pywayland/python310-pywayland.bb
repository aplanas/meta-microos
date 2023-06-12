SUMMARY = "Python binding to the wayland library using cffi"
DESCRIPTION = "Python binding to the wayland library using cffi."
LICENSE = "NCSA"

PV = "0.4.15"

RPM_NAME = "python310-pywayland-0.4.15-1.4.aarch64.rpm"
RPM_HASH = "82fffa69d70982fc82bb7d6440a9d599cb5b8191b1f9bf1ad0dce88e0507d9aab2f2b842c5a1db4b7e643b5c2f95a41cc8d36bafc87af62bb91c7a6151a31ac7"

RPROVIDES:${PN} += "python3-pywayland \
python3.10dist(pywayland) \
python310-pywayland \
python310-pywayland(aarch-64) \
python3dist(pywayland)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.28)(64bit) \
libwayland-client.so.0()(64bit) \
libwayland-server.so.0()(64bit) \
python(abi) \
update-alternatives"

inherit rpm