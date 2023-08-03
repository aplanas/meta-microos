SUMMARY = "A GNOME-Based Passphrase Dialog for OpenSSH"
DESCRIPTION = "SSH (Secure Shell) is a program for logging into a remote machine and \
for executing commands on a remote machine. This package contains a \
GNOME-based passphrase dialog for OpenSSH."
LICENSE = "BSD-2-Clause"

PV = "9.3p2"

RPM_NAME = "openssh-askpass-gnome-9.3p2-1.1.aarch64.rpm"
RPM_HASH = "250a711b6183b30c4734baf055813d715bccb083263e03e349ae6ace4ae4c246c6dc3a860d309848cde07aaed572e044cb53cfce12da9b4054969f0b458b8fd8"

RPROVIDES:${PN} += "openssh-askpass-gnome"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
openssh-clients"

inherit rpm
