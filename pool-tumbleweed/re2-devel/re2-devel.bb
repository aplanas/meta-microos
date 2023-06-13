SUMMARY = "C++ header files and library symbolic links for re2"
DESCRIPTION = "This package contains the C++ header files and symbolic links to the shared \
libraries for re2. If you would like to develop programs using re2, \
you will need to install re2-devel."
LICENSE = "BSD-3-Clause"

PV = "20230301"

RPM_NAME = "re2-devel-20230301-53.4.aarch64.rpm"
RPM_HASH = "a8a56bc569933ea2578dde90f7609123531fdc86420395992ce68cc11d1820e7ab9a2b6fc431a837cd30a906f0545570ec938729fbea0ee09352067150b57af8"

RPROVIDES:${PN} += "cmake(re2) \
pkgconfig(re2) \
re2-devel \
re2-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libre2-10 \
pkgconfig(icu-uc)"

inherit rpm
