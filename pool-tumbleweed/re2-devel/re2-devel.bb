SUMMARY = "C++ header files and library symbolic links for re2"
DESCRIPTION = "This package contains the C++ header files and symbolic links to the shared \
libraries for re2. If you would like to develop programs using re2, \
you will need to install re2-devel."
LICENSE = "BSD-3-Clause"

PV = "20230901"

RPM_NAME = "re2-devel-20230901-56.2.aarch64.rpm"
RPM_HASH = "131760972bed1160f58b5c2bf59f69932a23362e700b549b854dc2908edc313117ed704b3e82ea00ac13c02158a033f1daca48933821bc8e4eb33f7fae33e572"

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
