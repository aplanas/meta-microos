SUMMARY = "Python bindings for the MLT multimedia framework"
DESCRIPTION = "MLT is a multimedia framework for television broadcasting. It \
provides a toolkit for broadcasters, video editors, media players, \
transcoders and web streamers. \
This package contains python bindings."
LICENSE = "GPL-3.0-or-later"

PV = "7.14.0"

RPM_NAME = "python3-mlt-7.14.0-2.2.aarch64.rpm"
RPM_HASH = "1a672c2cae42bc30f54bc397d61d4bffaf485cd1c07e2f0eecaae9d04dfaaabbb6d23f107901b2416d92fb20f1c7687c90e8b0c0c71f86a5f42cd3cddc97a7da"

RPROVIDES:${PN} += "python3-mlt \
python3-mlt(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libmlt++-7.so.7()(64bit) \
libmlt++-7.so.7(MLTPP_0.8.8)(64bit) \
libmlt++-7.so.7(MLTPP_0.9.0)(64bit) \
libmlt++-7.so.7(MLTPP_0.9.2)(64bit) \
libmlt++-7.so.7(MLTPP_0.9.4)(64bit) \
libmlt++-7.so.7(MLTPP_0.9.8)(64bit) \
libmlt++-7.so.7(MLTPP_6.10.0)(64bit) \
libmlt++-7.so.7(MLTPP_6.14.0)(64bit) \
libmlt++-7.so.7(MLTPP_6.18.0)(64bit) \
libmlt++-7.so.7(MLTPP_6.20.0)(64bit) \
libmlt++-7.so.7(MLTPP_6.22.0)(64bit) \
libmlt++-7.so.7(MLTPP_6.4.0)(64bit) \
libmlt++-7.so.7(MLTPP_6.6.0)(64bit) \
libmlt++-7.so.7(MLTPP_6.8.0)(64bit) \
libmlt++-7.so.7(MLTPP_7.0.0)(64bit) \
libmlt++-7.so.7(MLTPP_7.1.0)(64bit) \
libmlt++-7.so.7(MLT_7.12.0)(64bit) \
libmlt++-7.so.7(MLT_7.14.0)(64bit) \
libmlt++-7.so.7(MLT_7.4.0)(64bit) \
libmlt++-7.so.7(MLT_7.6.0)(64bit) \
libmlt-7.so.7()(64bit) \
libmlt-7.so.7(MLT_0.8.8)(64bit) \
libmlt-7.so.7(MLT_0.9.10)(64bit) \
libmlt-7.so.7(MLT_7.0.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
python(abi)"

inherit rpm
