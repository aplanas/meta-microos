SUMMARY = "Library for AES encryption"
DESCRIPTION = "libcaes is a library for AES encryption."
LICENSE = "LGPL-3.0-or-later"

PV = "20230406"

RPM_NAME = "python39-libcaes-20230406-1.1.aarch64.rpm"
RPM_HASH = "a5a07060eb1a619a97031e6cfb67ebb9556b0dd1eb93e09c0d03766d3f354870ac05348e2edbb7dbe29cb18df40b2cf79f36d8bac93af6e7f2e2cded52563953"

RPROVIDES:${PN} += "python39-libcaes \
python39-libcaes(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcaes.so.1()(64bit) \
libcaes.so.1(V_20230406)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
python(abi)"

inherit rpm
