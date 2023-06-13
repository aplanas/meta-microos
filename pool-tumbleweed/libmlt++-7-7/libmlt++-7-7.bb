SUMMARY = "C++ library API for the MLT multimedia framework"
DESCRIPTION = "MLT is a multimedia framework for television broadcasting. It \
provides a toolkit for broadcasters, video editors, media players, \
transcoders and web streamers. \
 \
This subpackage contains the C++ library API for MLT."
LICENSE = "GPL-3.0-or-later"

PV = "7.14.0"

RPM_NAME = "libmlt++-7-7-7.14.0-2.2.aarch64.rpm"
RPM_HASH = "a3b903cf62dea944b6763bfaf71f96b4b8cb83b411cc4889d5971e4ac24bd3926a813956debb7a97b5616516e5c8d823d687327df028af24a6b3413d4a4fca8e"

RPROVIDES:${PN} += "libmlt++-7-7 \
libmlt++-7-7(aarch-64) \
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
libmlt++-7.so.7(MLT_7.6.0)(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libmlt-7.so.7()(64bit) \
libmlt-7.so.7(MLT_0.8.8)(64bit) \
libmlt-7.so.7(MLT_0.9.0)(64bit) \
libmlt-7.so.7(MLT_0.9.2)(64bit) \
libmlt-7.so.7(MLT_0.9.8)(64bit) \
libmlt-7.so.7(MLT_6.10.0)(64bit) \
libmlt-7.so.7(MLT_6.14.0)(64bit) \
libmlt-7.so.7(MLT_6.20.0)(64bit) \
libmlt-7.so.7(MLT_6.22.0)(64bit) \
libmlt-7.so.7(MLT_6.6.0)(64bit) \
libmlt-7.so.7(MLT_6.8.0)(64bit) \
libmlt-7.so.7(MLT_7.0.0)(64bit) \
libmlt-7.so.7(MLT_7.1.0)(64bit) \
libmlt-7.so.7(MLT_7.12.0)(64bit) \
libmlt-7.so.7(MLT_7.14.0)(64bit) \
libmlt-7.so.7(MLT_7.4.0)(64bit) \
libmlt-7.so.7(MLT_7.6.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
