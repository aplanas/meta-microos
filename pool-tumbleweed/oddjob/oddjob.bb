SUMMARY = "A D-Bus service which runs odd jobs on behalf of client applications"
DESCRIPTION = "oddjob is a D-Bus service which performs particular tasks for clients which \
connect to it and issue requests using the system-wide message bus."
LICENSE = "BSD-3-Clause"

PV = "0.34.7"

RPM_NAME = "oddjob-0.34.7-2.1.aarch64.rpm"
RPM_HASH = "e9c20bbe1052d25dfe38c8097fa73f32fe76fdbb650a7ce9631c241632cf8f9d1b0b78443427a4b321beba513d3ebe4c0389d89379c2818ce4f2522df475ef64"

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
