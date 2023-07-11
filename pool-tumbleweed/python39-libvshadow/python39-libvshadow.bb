SUMMARY = "Library to access the Volume Shadow Snapshot (VSS) format"
DESCRIPTION = "Library and tools to access the Volume Shadow Snapshot (VSS) format. \
The VSS format is used by Windows, as of Vista, to maintain copies of \
data on a storage media volume."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221030"

RPM_NAME = "python39-libvshadow-20221030-3.7.aarch64.rpm"
RPM_HASH = "06caf180a1f2aa06b44e93e3e7e0d2113f7e2de77f6a42fe3e7c137bd0588fc12c703130053f42a35ab377bf4fec7d5f954c67335ab83a15e301af7c6547ff82"

RPROVIDES:${PN} += "python39-libvshadow"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libvshadow.so.1 \
python-abi"

inherit rpm
