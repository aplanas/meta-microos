SUMMARY = "A GNOME-Based Passphrase Dialog for OpenSSH"
DESCRIPTION = "SSH (Secure Shell) is a program for logging into a remote machine and \
for executing commands on a remote machine. This package contains a \
GNOME-based passphrase dialog for OpenSSH."
LICENSE = "BSD-2-Clause"

PV = "8.9p1"

RPM_NAME = "openssh-askpass-gnome-8.9p1-9.2.aarch64.rpm"
RPM_HASH = "2a008a20bf6e3614cd6639a0d00f3f7a9f2cf55c2fc8e99a1a07d4aa466c46e684fd3e689c1b4aaa40068f2376f6daabe07c120b93d9170dc94073d85af29b11"

RPROVIDES:${PN} += "openssh-askpass-gnome \
openssh-askpass-gnome(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-3.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
openssh"

inherit rpm
