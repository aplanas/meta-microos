SUMMARY = "YaST2 - Core Libraries"
DESCRIPTION = "This package contains include and documentation files for developing \
applications using the YaST2 YCP interpreter."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "yast2-core-devel-4.6.0-1.4.aarch64.rpm"
RPM_HASH = "c4a204d8f3026d58a3559b2b856a017ee5a737cf3ccf959e6ba26399d7b514d9d62d8ab3e3520b4c4560461f0c5b85b69e6f27c810965ef983461dda7351893b"

RPROVIDES:${PN} += "liby2util-devel \
pkgconfig-yast2-core \
yast2-core-devel"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
/usr/bin/pkg-config \
glibc-devel \
libstdc++-devel \
yast2-core"

inherit rpm
