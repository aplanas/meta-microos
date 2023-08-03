SUMMARY = "C++ header files and library symbolic links for re2"
DESCRIPTION = "This package contains the C++ header files and symbolic links to the shared \
libraries for re2. If you would like to develop programs using re2, \
you will need to install re2-devel."
LICENSE = "BSD-3-Clause"

PV = "20230701"

RPM_NAME = "re2-devel-20230701-54.1.aarch64.rpm"
RPM_HASH = "cc63fc13d7a0e6a2b2ea0cd6d31e7f4f5370908b5f7581ad129855f75de9c99947280527fc898c1063d616ccb7b7c380d28eed4c1d7c1c573aca671ef1b35c60"

RPROVIDES:${PN} += "cmake-re2 \
pkgconfig-re2 \
re2-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libre2-11 \
pkgconfig-absl-base \
pkgconfig-absl-core-headers \
pkgconfig-absl-fixed-array \
pkgconfig-absl-flags \
pkgconfig-absl-flat-hash-map \
pkgconfig-absl-flat-hash-set \
pkgconfig-absl-inlined-vector \
pkgconfig-absl-optional \
pkgconfig-absl-span \
pkgconfig-absl-str-format \
pkgconfig-absl-strings \
pkgconfig-absl-synchronization \
pkgconfig-icu-uc"

inherit rpm
