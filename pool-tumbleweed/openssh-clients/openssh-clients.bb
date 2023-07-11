SUMMARY = "SSH (Secure Shell) client applications"
DESCRIPTION = "SSH (Secure Shell) is a program for logging into and executing commands \
on a remote machine. It replaces rsh (rlogin and rsh) and \
provides secure encrypted communication between two untrusted \
hosts over an insecure network. \
 \
xorg-x11 (X Window System) connections and arbitrary TCP/IP ports can \
also be forwarded over the secure channel. \
 \
This package contains clients for making secure connections to Secure \
Shell servers."
LICENSE = "BSD-2-Clause & MIT"

PV = "9.3p1"

RPM_NAME = "openssh-clients-9.3p1-1.2.aarch64.rpm"
RPM_HASH = "e8e56ba320317168599278ac4f93c9b5b242c469c5d6840eb18ab5e7bc36ed968b85d58ed1b43837dd5c88a9e737f8dc02ddc36217b5899693d6535bdc01c237"

RPROVIDES:${PN} += "openssh-/usr/bin/ssh \
openssh-clients"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libedit.so.0 \
libfido2.so.1 \
libgssapi-krb5.so.2 \
libselinux.so.1 \
libz.so.1 \
openssh-common"

inherit rpm
