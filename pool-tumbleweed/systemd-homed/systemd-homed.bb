SUMMARY = "Home Area/User Account Manager"
DESCRIPTION = "This package contains systemd-homed.service, a system service that manages home \
directories of users. The home directories managed are self-contained, and thus \
include the user's full metadata record in the home's data storage itself, \
making them easy to migrate between machines; the user account and home \
directory becoming the same concept. \
 \
This package also includes homectl(1), a tool to interact with systemd-homed and \
PAM module to automatically mount home directories on user login. \
 \
See homectl(1) man page for instructions to create a new user account. \
 \
A description of the various storage mechanisms implemented by systemd-homed can \
be found at https://systemd.io/HOME_DIRECTORY/. \
 \
Note that nss-systemd has still not been integrated into nsswitch and therefore \
needs to be added manually into /etc/nsswitch.conf, see nss-systemd(8) man page \
for an example on how to do that."
LICENSE = "LGPL-2.1-or-later"

PV = "253.8"

RPM_NAME = "systemd-homed-253.8-1.2.aarch64.rpm"
RPM_HASH = "e49c424af7adf8b4a1a2dd447155e693eb4836e133cd9de753c9001e6fa7e619279145a8dd79af019932c73d9b39bd8c3e27ffadf7efa74270083fe6bccd3974"

RPROVIDES:${PN} += "config-systemd-homed \
systemd-homed"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libcap.so.2 \
libcrypto.so.3 \
libfdisk.so.1 \
libm.so.6 \
libp11-kit.so.0 \
libpam.so.0 \
libsystemd-shared-253.so \
systemd"

inherit rpm
