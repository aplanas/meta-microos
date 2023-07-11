SUMMARY = "Python binding to the wayland library using cffi"
DESCRIPTION = "Python binding to the wayland library using cffi."
LICENSE = "NCSA"

PV = "0.4.15"

RPM_NAME = "python39-pywayland-0.4.15-1.5.aarch64.rpm"
RPM_HASH = "7c11b39f6035e3d7526fc41df6e39464baeea74bd679804d742f8e7fd10f319ca49721aa6e6239a348421349a9b93208376ff78538dbd1e87023e9d0e7bc604d"

RPROVIDES:${PN} += "python3.9dist-pywayland \
python39-pywayland \
python3dist-pywayland"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libwayland-client.so.0 \
libwayland-server.so.0 \
python-abi \
update-alternatives"

inherit rpm
