SUMMARY = "OpenSSH AuthorizedKeysCommand helpers"
DESCRIPTION = "SSH (Secure Shell) is a program for logging into and executing commands \
on a remote machine. It replaces rsh (rlogin and rsh) and \
provides secure encrypted communication between two untrusted \
hosts over an insecure network. \
 \
xorg-x11 (X Window System) connections and arbitrary TCP/IP ports can \
also be forwarded over the secure channel. \
 \
This package contains helper applications for OpenSSH which retrieve \
keys from various sources."
LICENSE = "BSD-2-Clause & MIT"

PV = "9.3p1"

RPM_NAME = "openssh-helpers-9.3p1-1.2.aarch64.rpm"
RPM_HASH = "a88d2846ab54f417092f6ca2b1b94724aabd927ef9511b5c71c2ee9391df5aa4a997e96dea0f75159f2a89bf245c5ec18df13a50a5b3a07133a11de41928eeda"

RPROVIDES:${PN} += "config-openssh-helpers \
openssh-helpers"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
openssh-common"

inherit rpm
