SUMMARY = "Library to access the Volume Shadow Snapshot (VSS) format"
DESCRIPTION = "Library and tools to access the Volume Shadow Snapshot (VSS) format. \
The VSS format is used by Windows, as of Vista, to maintain copies of \
data on a storage media volume."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221030"

RPM_NAME = "python310-libvshadow-20221030-3.7.aarch64.rpm"
RPM_HASH = "f891324f4f3b2bf5e50143fdf3ea4b1c5ce85b617ac07b9a68d2b3547e2825ccb2349c28a1e36271ee5d9f87c819007b4fd9a982c2f2824f6e48846c4c4b4bfe"

RPROVIDES:${PN} += "python310-libvshadow"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libvshadow.so.1 \
python-abi"

inherit rpm
