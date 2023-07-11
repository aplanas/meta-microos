SUMMARY = "Library to access the Volume Shadow Snapshot (VSS) format"
DESCRIPTION = "Library and tools to access the Volume Shadow Snapshot (VSS) format. \
The VSS format is used by Windows, as of Vista, to maintain copies of \
data on a storage media volume."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221030"

RPM_NAME = "python311-libvshadow-20221030-3.7.aarch64.rpm"
RPM_HASH = "d0802cff733ef664609f7668c1aaab077f374f2298a291232c48424851f918b89ced7688f7e30517d3f8ea23ddea10fec0e79df74aa076f1dac4ea80c5928de2"

RPROVIDES:${PN} += "python3-libvshadow \
python311-libvshadow"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libvshadow.so.1 \
python-abi"

inherit rpm
