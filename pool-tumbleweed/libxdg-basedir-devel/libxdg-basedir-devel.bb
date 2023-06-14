SUMMARY = "XDG Base Directory Specification Library"
DESCRIPTION = "The XDG Base Directory Specification defines where should user files be looked \
for by defining one or more base directories relative in with they should be \
located. \
 \
This library implements functions to list the directories according to the \
specification and provides a few higher-level functions."
LICENSE = "MIT"

PV = "1.2.3"

RPM_NAME = "libxdg-basedir-devel-1.2.3-1.6.aarch64.rpm"
RPM_HASH = "48fc66d2c0ff6b5eeb24e66352a6589ce74db3b5f9772ded582319edca6efdf977882d4539c64c60daff6f65b31f5281407b1c7142ee8b1b10e159120887d9ff"

RPROVIDES:${PN} += "libxdg-basedir-devel \
pkgconfig-libxdg-basedir"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxdg-basedir1"

inherit rpm
