SUMMARY = "Development files for LAL metaio"
DESCRIPTION = "This package contains sources and header files needed to build applications \
that use the LAL MetaIO library."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.0"

RPM_NAME = "lalmetaio-devel-3.0.0-1.2.aarch64.rpm"
RPM_HASH = "e4927b5d9105b96e705e6532eab98ffbb4145c983d94e2749bfa9759b6ed76d9799ff52a68ddab5f497a1b1ab9ec876671510d93d0e359c1c6a4791a737da6b4"

RPROVIDES:${PN} += "config-lalmetaio-devel \
lalmetaio-devel \
pkgconfig-lalmetaio"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblal.so.20 \
liblalmetaio.so.10 \
liblalmetaio10 \
pkgconfig-lal \
pkgconfig-libmetaio"

inherit rpm
