SUMMARY = "Apple Lossless Audio Codec"
DESCRIPTION = "The Apple Lossless Audio Codec (ALAC) is an audio codec developed by Apple and \
supported on iPhone, iPad, most iPods, Mac and iTunes.  ALAC is a data \
compression method which reduces the size of audio files with no loss of \
information.  A decoded ALAC stream is bit-for-bit identical to the original \
uncompressed audio file. \
 \
This package contains a command-line utility to convert the ALAC format."
LICENSE = "Apache-2.0"

PV = "0.0+git.20160511"

RPM_NAME = "alac-0.0+git.20160511-3.13.aarch64.rpm"
RPM_HASH = "0f1f0bfd734cee2dcca52932b892fd12b8020cf7812b6cfdfefcc5ddee7675c05ee4446c1fb7bc45c87b6a8f59aa03c367efd8c8dd1251af80608599a2abedb8"

RPROVIDES:${PN} += "alac \
alac(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libalac.so.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
