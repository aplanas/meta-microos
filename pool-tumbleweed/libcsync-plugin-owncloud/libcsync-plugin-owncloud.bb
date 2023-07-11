SUMMARY = "Owncloud plugin for csync"
DESCRIPTION = "This plug-in allows applications using csync to synchronize with Owncloud."
LICENSE = "GPL-2.0-or-later"

PV = "0.50.0"

RPM_NAME = "libcsync-plugin-owncloud-0.50.0-11.10.aarch64.rpm"
RPM_HASH = "84fa7dce537ba28acd8480ca31ec3074edc92fdf4c30bfa2c46c9a5ae9802ac98911f4d63eef06e449b857d17d865790ae913cfa31da9758a71242143d553700"

RPROVIDES:${PN} += "libcsync-plugin-owncloud"

RDEPENDS:${PN} += "libc.so.6 \
libcsync.so.0 \
libcsync0 \
libneon.so.27"

inherit rpm
