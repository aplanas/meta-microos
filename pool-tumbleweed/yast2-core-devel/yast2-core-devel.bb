SUMMARY = "YaST2 - Core Libraries"
DESCRIPTION = "This package contains include and documentation files for developing \
applications using the YaST2 YCP interpreter."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "yast2-core-devel-4.6.0-1.5.aarch64.rpm"
RPM_HASH = "eec154d234bd3cc4ede6772d93a9d84069890785d02c11abd06db17a45fdcd458be829990bdb6101ca5967afacda1104aac83b09f4d93088ca6e14a6de30f617"

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
