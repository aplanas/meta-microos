SUMMARY = "Library to access the Volume Shadow Snapshot (VSS) format"
DESCRIPTION = "Library and tools to access the Volume Shadow Snapshot (VSS) format. \
The VSS format is used by Windows, as of Vista, to maintain copies of \
data on a storage media volume."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221030"

RPM_NAME = "python39-libvshadow-20221030-3.5.aarch64.rpm"
RPM_HASH = "6906f261bac392be57d4e773cc7cb585231eb0621ef87a329b8c8b8401d5f191e3295d849f63a282f18db09ccc10b2d4844474b4055b0a3d350d169d49d3ffea"

RPROVIDES:${PN} += "python39-libvshadow \
python39-libvshadow(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libfguid.so.1()(64bit) \
libfguid.so.1(V_20220113)(64bit) \
libvshadow.so.1()(64bit) \
libvshadow.so.1(V_20221030)(64bit) \
python(abi)"

inherit rpm
