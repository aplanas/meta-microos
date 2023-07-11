SUMMARY = "Development package for the LZMA library"
DESCRIPTION = "This package contains the header files and libraries needed for \
compiling programs using the LZMA library."
LICENSE = "SUSE-Public-Domain"

PV = "5.4.3"

RPM_NAME = "xz-devel-5.4.3-1.3.aarch64.rpm"
RPM_HASH = "a0c5141181b0af5669d60ced5af7949ccc71da3d2078b9d67168db13eaeb5c3442b5b301e935ddcaa6774f4f415409a8c4cbdee6018f8201e4fc9f12f1cc67b0"

RPROVIDES:${PN} += "lzma-alpha-devel \
lzma-devel \
pkgconfig-liblzma \
xz-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblzma5"

inherit rpm
