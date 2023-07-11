SUMMARY = "Library to support the Windows Resource Compiler format"
DESCRIPTION = "libwrc is a library to support the Windows Resource Compiler format."
LICENSE = "LGPL-3.0-or-later"

PV = "20230318"

RPM_NAME = "python311-libwrc-20230318-1.4.aarch64.rpm"
RPM_HASH = "28e680c1de3c5c88990cd0dc24db6698113f6b892288e6b123e5be4c26eb63909a6b536b04fd135721bea7e8ef19a0d768be2eb2798db2f619fc0657b7051179"

RPROVIDES:${PN} += "python3-libwrc \
python311-libwrc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libwrc.so.1 \
python-abi"

inherit rpm
