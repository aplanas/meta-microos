SUMMARY = "Free Lossless Audio Codec"
DESCRIPTION = "FLAC is an audio coding format for lossless compression of digital \
audio, and is also the name of the reference software package that \
includes a codec implementation. Digital audio compressed by FLAC's \
algorithm can typically be reduced to between 50 and 70 percent of \
its original size, and decompresses to an identical copy of the \
original audio data."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & GFDL-1.2-only"

PV = "1.4.2"

RPM_NAME = "flac-1.4.2-2.3.aarch64.rpm"
RPM_HASH = "45359c7ed13cd58ed40c228fad91e777fe25dcb4d9934affdb2993d79a515bc177f4e82c492726eb0b88cf55c1b9791db7de0e9bc88bedf0dd37ba51939d9574"

RPROVIDES:${PN} += "flac \
flac(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libFLAC.so.12()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
