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

RPM_NAME = "gnome-keyring-pam-42.1-2.3.aarch64.rpm"
RPM_HASH = "bcbb7a571bdbbb971a17d3a43bdb49c4ac1d242239c9c77648ccbb7a94abf75b420c5b8c2979878b9d0c1d90954280201ac21e364bb4369e2c004b7d17266527"

RPROVIDES:${PN} += "gnome-keyring-pam \
gnome-keyring-pam(aarch-64) \
pam_keyring"

RDEPENDS:${PN} += "/bin/sh \
gnome-keyring \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpam.so.0()(64bit) \
libselinux.so.1()(64bit) \
pam-config \
sed"

inherit rpm
