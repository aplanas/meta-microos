SUMMARY = "Development files for OpenShadingLanguage"
DESCRIPTION = "The OpenShadingLanguage-devel package contains libraries and header files for \
developing applications that use OpenShadingLanguage."
LICENSE = "BSD-3-Clause"

PV = "1.12.10.0"

RPM_NAME = "OpenShadingLanguage-devel-1.12.10.0-2.1.aarch64.rpm"
RPM_HASH = "0afa9e217f6c1709d235d457828dc2190b4b164dc89f9a75a92eaa153516ab36f312eee38c9a4097a269d63fc2a2f1c4b60c56c17f2427eecd6b506a83c07cc0"

RPROVIDES:${PN} += "OpenShadingLanguage-devel \
cmake-OSL \
pkgconfig-oslcomp \
pkgconfig-oslexec \
pkgconfig-oslquery"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
OpenShadingLanguage \
liboslcomp1-12 \
liboslexec1-12 \
liboslnoise1-12 \
liboslquery1-12 \
libtestshade1-12"

inherit rpm
