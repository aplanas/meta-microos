SUMMARY = "A D-Bus service which runs odd jobs on behalf of client applications"
DESCRIPTION = "oddjob is a D-Bus service which performs particular tasks for clients which \
connect to it and issue requests using the system-wide message bus."
LICENSE = "BSD-3-Clause"

PV = "0.34.7"

RPM_NAME = "oddjob-0.34.7-1.6.aarch64.rpm"
RPM_HASH = "b383153f998731ab92df43c08a7101b9ef00a645c4bab62c2824057a68416b1620e5f75b6576bdc9a15d056056ab382da501a78622902507b3a2e586a53e4a25"

RPROVIDES:${PN} += "config-oddjob \
oddjob"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
dbus-1 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libselinux.so.1 \
libxml2.so.2 \
psmisc \
systemd"

inherit rpm
