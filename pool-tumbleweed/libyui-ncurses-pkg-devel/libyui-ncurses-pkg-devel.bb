SUMMARY = "Libyui-ncurses-pkg header files"
DESCRIPTION = " \
This package contains the header files for the NCurses (text based) \
package selector component for libyui."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.6.0"

RPM_NAME = "libyui-ncurses-pkg-devel-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "9d16e56bf580527ea0ec18f0fd4bef94199f931d6239d6db571966d84bc595cea677e4579187f58e1cb33a0b4bf07051fb4bb37b8512bfb9a64f7e4659c8ac13"

RPROVIDES:${PN} += "libyui-ncurses-pkg-devel \
libyui-ncurses-pkg-devel(aarch-64)"
RDEPENDS:${PN} += "boost-devel \
glibc-devel \
libstdc++-devel \
libyui-ncurses-devel \
libyui-ncurses-pkg16 \
libzypp-devel"

inherit rpm
