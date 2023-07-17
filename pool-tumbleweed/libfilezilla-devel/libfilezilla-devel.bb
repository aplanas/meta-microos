SUMMARY = "Development package for libfilezilla"
DESCRIPTION = "Files needed for development with libfilezilla."
LICENSE = "GPL-2.0-or-later"

PV = "0.44.0"

RPM_NAME = "libfilezilla-devel-0.44.0-1.1.aarch64.rpm"
RPM_HASH = "7c33617cfd37df0c2d581456229e0b212de6b761141d6a47834dbbc8e49f405700514b8c9073f0b7c0cc3339ee853826724756bc1cd44be812503d2d0a0c5f28"

RPROVIDES:${PN} += "libfilezilla-devel \
pkgconfig-libfilezilla"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfilezilla40 \
pkgconfig-gnutls \
pkgconfig-hogweed \
pkgconfig-nettle"

inherit rpm
