SUMMARY = "Library for AES encryption"
DESCRIPTION = "libcaes is a library for AES encryption."
LICENSE = "LGPL-3.0-or-later"

PV = "20230406"

RPM_NAME = "python311-libcaes-20230406-1.1.aarch64.rpm"
RPM_HASH = "49b32d96fe20e9a4281a26338c0e11aae052f7c000f3057eee2f56e8fa0209a3d2998981edd9faf5c9c290dff36bce0b0fabaabdb8339bb03be7287d724adbc7"

RPROVIDES:${PN} += "python311-libcaes \
python311-libcaes(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcaes.so.1()(64bit) \
libcaes.so.1(V_20230406)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
python(abi)"

inherit rpm
