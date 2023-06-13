SUMMARY = "Multilingual text processing library for the C language"
DESCRIPTION = "A multilingual text processing library for the C language"
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "m17n-lib-devel-1.8.0-1.12.aarch64.rpm"
RPM_HASH = "63419f9545954b54ecd1cbd46bd971c136f9da1fec84355557d76869d90d796ff5b922ccb06172908d8c1b9a890000f0a8eb9224e55a6fe08d78487dc5c992fd"

RPROVIDES:${PN} += "m17n-lib-devel \
m17n-lib-devel(aarch-64) \
pkgconfig(m17n-core) \
pkgconfig(m17n-flt) \
pkgconfig(m17n-gui) \
pkgconfig(m17n-shell)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
m17n-lib"

inherit rpm
