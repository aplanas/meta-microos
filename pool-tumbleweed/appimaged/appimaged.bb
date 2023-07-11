SUMMARY = "Daemon handles (un)registering AppImages with the system"
DESCRIPTION = "appimaged is a daemon that handles registering and unregistering AppImages \
with the system (e.g., menu entries, icons, MIME types, binary delta updates, \
and such). \
 \
The package comes also with appimage.validate CLI tool to verify signature \
of AppImage files."
LICENSE = "MIT"

PV = "10"

RPM_NAME = "appimaged-10-1.10.aarch64.rpm"
RPM_HASH = "d33e10e06ba0b683a5109cb9189522d87e45f9d9273f106386f687439768c2a8e76c143a30c2d56b6257f5cd0d4124dbe88f1996b1b8c8f26861e7594cd5f5b9"

RPROVIDES:${PN} += "appimaged"

RDEPENDS:${PN} += "/usr/bin/sh \
libarchive.so.13 \
libc.so.6 \
libcairo.so.2 \
libcrypto.so.3 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libinotifytools.so.0 \
liblzma.so.5 \
libz.so.1 \
zsync"

inherit rpm
