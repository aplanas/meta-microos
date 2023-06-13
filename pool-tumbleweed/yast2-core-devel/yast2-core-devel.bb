SUMMARY = "YaST2 - Core Libraries"
DESCRIPTION = "This package contains include and documentation files for developing \
applications using the YaST2 YCP interpreter."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "yast2-core-devel-4.6.0-1.3.aarch64.rpm"
RPM_HASH = "ead5037151f320b171510d86a5499d5ed505a8ec352185cd68cbc3f6356823926faca35f1ec35f1e940f61f295c298838d269dc07180bef8dc255ebd2d88d76e"

RPROVIDES:${PN} += "liby2util-devel \
pkgconfig(yast2-core) \
yast2-core-devel \
yast2-core-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
/usr/bin/pkg-config \
glibc-devel \
libstdc++-devel \
yast2-core"

inherit rpm
