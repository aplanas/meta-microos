SUMMARY = "Include files and development libraries"
DESCRIPTION = "Headers and development libraries for libotr"
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "4.1.1"

RPM_NAME = "libotr-devel-4.1.1-4.3.aarch64.rpm"
RPM_HASH = "a72bc0dbd3f217d0412d520e629f47d5756a18e463a5b6ea25ccee2e68bbc536e2dba617627ea97fb49e2016bfdff9762b5de1f839636854e32504bfb0bdcdcb"

RPROVIDES:${PN} += "libotr-devel \
pkgconfig-libotr"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgcrypt-devel \
libotr5"

inherit rpm
