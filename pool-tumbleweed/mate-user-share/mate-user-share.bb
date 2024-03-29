SUMMARY = "MATE Desktop file sharing for the masses"
DESCRIPTION = "mate-user-share is a small package that binds together various \
free software projects to bring easy to use user-level file sharing \
to the masses."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "mate-user-share-1.26.0-1.9.aarch64.rpm"
RPM_HASH = "5633f164efcbeb82d067c7fa06272fba67f5fdb2b00060b101b86d5b333471882a20f9d2a1a0169a467129286d4b6f3bb06f8ec2821eed4caa4e4a4a92c7b774"

RPROVIDES:${PN} += "config-mate-user-share \
libcaja-user-share.so \
mate-user-share"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcaja-extension.so.1 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libselinux.so.1"

inherit rpm
