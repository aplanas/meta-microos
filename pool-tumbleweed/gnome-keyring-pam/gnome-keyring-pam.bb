SUMMARY = "GNOME Keyring - PAM module"
DESCRIPTION = "The GNOME Keyring is a daemon in the session, similar to ssh-agent, \
and other applications can use it to store passwords and other \
sensitive information. \
 \
The program can manage several keyrings, each with its own master \
password, and there is also a session keyring which is never stored to \
disk, but forgotten when the session ends. \
 \
The PAM module can be used to unlock the keyring on login."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "42.1"

RPM_NAME = "gnome-keyring-pam-42.1-2.4.aarch64.rpm"
RPM_HASH = "c151c83777ade2ff188cf14af5a34f4fd6a85262b6c9268297b1dec72d266d8be84ee8d632d8fd3fc2294379f9b39794dacef0c429d6988849688f48c9ae5bf4"

RPROVIDES:${PN} += "gnome-keyring-pam \
pam-keyring"

RDEPENDS:${PN} += "/usr/bin/sh \
gnome-keyring \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpam.so.0 \
libselinux.so.1 \
pam-config \
sed"

inherit rpm
