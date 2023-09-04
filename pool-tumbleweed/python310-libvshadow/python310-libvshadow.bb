SUMMARY = "Library to access the Volume Shadow Snapshot (VSS) format"
DESCRIPTION = "Library and tools to access the Volume Shadow Snapshot (VSS) format. \
The VSS format is used by Windows, as of Vista, to maintain copies of \
data on a storage media volume."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221030"

RPM_NAME = "python310-libvshadow-20221030-4.1.aarch64.rpm"
RPM_HASH = "3f4f8bead4939d83c08f650c7bc8487be6ad92c21ff35db259f4c7b16c9faac90d68edff8394b5866affd2986501922c900bae433e24253776099aa4c43af73e"

RPROVIDES:${PN} += "python310-libvshadow"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libvshadow.so.1 \
python-abi"

inherit rpm
