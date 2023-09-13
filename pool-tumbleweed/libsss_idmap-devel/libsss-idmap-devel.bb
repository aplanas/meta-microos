SUMMARY = "Development files for the FreeIPA idmap library"
DESCRIPTION = "A utility library for FreeIPA to map Windows SIDs to Unix user/group IDs."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.2"

RPM_NAME = "libsss_idmap-devel-2.9.2-1.1.aarch64.rpm"
RPM_HASH = "1549e085559d5c1285583655fd68249e08ee9f72c2086e1aaf44abf1c505dc850841f3e8302e2e68118f7efe07dbd118a8aec8d799a68ec4b84e6b73c49190c9"

RPROVIDES:${PN} += "libsss-idmap-devel \
pkgconfig-sss-idmap"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsss-idmap0"

inherit rpm
