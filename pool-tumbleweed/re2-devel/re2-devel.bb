SUMMARY = "C++ header files and library symbolic links for re2"
DESCRIPTION = "This package contains the C++ header files and symbolic links to the shared \
libraries for re2. If you would like to develop programs using re2, \
you will need to install re2-devel."
LICENSE = "BSD-3-Clause"

PV = "20230801"

RPM_NAME = "re2-devel-20230801-55.1.aarch64.rpm"
RPM_HASH = "a95c190e119245b57a2034e753ce9f89d37818e24334991d2203c18b15d367f8a137245a3aebc9695deccb151b3735a740f38f1effa11b90d627785c12e5fb9c"

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
