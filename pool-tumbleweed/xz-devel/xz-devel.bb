SUMMARY = "Development package for the LZMA library"
DESCRIPTION = "This package contains the header files and libraries needed for \
compiling programs using the LZMA library."
LICENSE = "SUSE-Public-Domain"

PV = "5.4.4"

RPM_NAME = "xz-devel-5.4.4-2.1.aarch64.rpm"
RPM_HASH = "6f3f610edf755b73f26b334c45140100170cc87475a94cbf13dd630ed5df8e5425d05fb7c0d491129a4db513cf9b1217ae2534f4291f4dbc110d9cde0753a042"

RPROVIDES:${PN} += "lzma-alpha-devel \
lzma-devel \
pkgconfig-liblzma \
xz-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblzma5"

inherit rpm
