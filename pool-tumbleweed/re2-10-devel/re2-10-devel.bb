SUMMARY = "C++ header files and library symbolic links for re2-10"
DESCRIPTION = "This package contains the C++ header files and symbolic links to the shared \
libraries for re2-10. If you would like to develop programs using re2-10, \
you will need to install re2-10-devel."
LICENSE = "BSD-3-Clause"

PV = "20230301"

RPM_NAME = "re2-10-devel-20230301-1.1.aarch64.rpm"
RPM_HASH = "0d56c2879d284a74173bc8df50962298addb189b92e875735a6cb848d77b956ed3a856217c65c357e02b4145ebee2284312ae1da7864a6c80b42e8f978055870"

RPROVIDES:${PN} += "cmake-re2 \
pkgconfig-re2 \
re2-10-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libre2-10 \
pkgconfig-icu-uc"

inherit rpm
