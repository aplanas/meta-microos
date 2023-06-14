SUMMARY = "Development files and documentation for GTS"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that use GTS."
LICENSE = "LGPL-2.0+"

PV = "0.7.6_p20121130"

RPM_NAME = "gts-devel-0.7.6_p20121130-4.29.aarch64.rpm"
RPM_HASH = "11795f03f53e6e8bed48c89186a070583f982e6f905772c32eb19f62e8da9caa79d11d184deec19f2629da75dd2326470fcbddc4d550ab99c793f0ecc0e36efe"

RPROVIDES:${PN} += "gts-devel \
pkgconfig-gts"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gcc \
gcc-c++ \
glib2-devel \
gts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgts-0-7-5 \
libgts-0.7.so.5 \
libnetpbm.so.11 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gthread-2.0"

inherit rpm
