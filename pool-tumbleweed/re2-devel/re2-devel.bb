SUMMARY = "C++ header files and library symbolic links for re2"
DESCRIPTION = "This package contains the C++ header files and symbolic links to the shared \
libraries for re2. If you would like to develop programs using re2, \
you will need to install re2-devel."
LICENSE = "BSD-3-Clause"

PV = "20230901"

RPM_NAME = "re2-devel-20230901-56.1.aarch64.rpm"
RPM_HASH = "6b776098a17c325bc5fa588c8000867cafd379c4773508257b18114b95051aada966394a3e62955fbb2ebb67b96b1dad76a1c3d1c67cbab1358c61866e01bab8"

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
