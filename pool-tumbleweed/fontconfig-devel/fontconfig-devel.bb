SUMMARY = "Header files for fontconfig"
DESCRIPTION = "This package countains all include files, libraries, configuration \
files needed for compiling applications which use the fontconfig \
library."
LICENSE = "MIT"

PV = "2.14.2"

RPM_NAME = "fontconfig-devel-2.14.2-1.4.aarch64.rpm"
RPM_HASH = "269ba26e3f663647785b44d0b855b62c1f9e20ccf3a3ed97b66091173595f3d4df5a25c77635b91b0ae14e769f4a58b5faa4162d9fef74dd7be1ed352877959e"

RPROVIDES:${PN} += "fontconfig-devel \
pkgconfig-fontconfig"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gettext-devel \
glibc-devel \
libfontconfig1 \
pkgconfig-expat \
pkgconfig-freetype2"

inherit rpm
