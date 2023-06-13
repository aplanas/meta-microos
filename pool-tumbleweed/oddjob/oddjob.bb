SUMMARY = "A D-Bus service which runs odd jobs on behalf of client applications"
DESCRIPTION = "oddjob is a D-Bus service which performs particular tasks for clients which \
connect to it and issue requests using the system-wide message bus."
LICENSE = "BSD-3-Clause"

PV = "0.34.7"

RPM_NAME = "oddjob-0.34.7-1.5.aarch64.rpm"
RPM_HASH = "580eac1663d22b4572590fcb69684141eb6c8c691d9885bbe4b1cea5845d559fafddffd1503737635d38b61aee356c6ce895def9b01e783eb69aede12a36561e"

RPROVIDES:${PN} += "config(oddjob) \
oddjob \
oddjob(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
dbus-1 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libselinux.so.1()(64bit) \
libxml2.so.2()(64bit) \
psmisc \
systemd"

inherit rpm
