SUMMARY = "XDG Base Directory Specification Library"
DESCRIPTION = "The XDG Base Directory Specification defines where should user files be looked \
for by defining one or more base directories relative in with they should be \
located. \
 \
This library implements functions to list the directories according to the \
specification and provides a few higher-level functions."
LICENSE = "MIT"

PV = "1.2.3"

RPM_NAME = "libxdg-basedir-devel-1.2.3-1.7.aarch64.rpm"
RPM_HASH = "0c3df7bb6a2c206685e8f757e644259b9beaf74634ab6bb42d8bc4327695fe798c492568ca28ed0e920ed1d06699935932be51a0ba469a615c9808ee6bd8fb85"

RPROVIDES:${PN} += "libxdg-basedir-devel \
pkgconfig-libxdg-basedir"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxdg-basedir1"

inherit rpm
