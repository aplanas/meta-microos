SUMMARY = "Development files for the FreeIPA idmap library"
DESCRIPTION = "A utility library for FreeIPA to map Windows SIDs to Unix user/group IDs."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.1"

RPM_NAME = "libsss_idmap-devel-2.9.1-1.1.aarch64.rpm"
RPM_HASH = "229a3a535238db8ac8d58ae258f0a33abd8bb6c8ddb8bbabdbf745ccc74627a4c42c6c6f06cd4affb35146b4c2b8486a864dfa990b797d92a04645049d6ea786"

RPROVIDES:${PN} += "libsss-idmap-devel \
pkgconfig-sss-idmap"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsss-idmap0"

inherit rpm
