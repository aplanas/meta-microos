SUMMARY = "A GNOME-Based Passphrase Dialog for OpenSSH"
DESCRIPTION = "SSH (Secure Shell) is a program for logging into a remote machine and \
for executing commands on a remote machine. This package contains a \
GNOME-based passphrase dialog for OpenSSH."
LICENSE = "BSD-2-Clause"

PV = "9.3p1"

RPM_NAME = "openssh-askpass-gnome-9.3p1-1.1.aarch64.rpm"
RPM_HASH = "3400f7372810de7827b50c6ce231ec469708d0fdd1a64ddb2af08c886a68c8eaadde8b6a68b02c30b30ed37f1783f3776796c599a419c81149bf6e311a6f5efc"

RPROVIDES:${PN} += "openssh-askpass-gnome"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
openssh-clients"

inherit rpm
