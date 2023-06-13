SUMMARY = "Development files for libelf"
DESCRIPTION = "This package contains the headers and libraries needed to build \
applications that require libelf."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libelf-devel-0.189-3.1.aarch64.rpm"
RPM_HASH = "b1e45b6181bf3abc4ee4514abf4ad69df977f3205ff8c5cdc80f8c80f4a4653007ef53eb8adeaa11e847620ca70b21cda643421d5dad80ba5d6a1fa2d6f50f0b"

RPROVIDES:${PN} += "libelf-devel \
libelf-devel(aarch-64) \
pkgconfig(libelf)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libelf1 \
pkgconfig(libzstd) \
pkgconfig(zlib)"

inherit rpm
