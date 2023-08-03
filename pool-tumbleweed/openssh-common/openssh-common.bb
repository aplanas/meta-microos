SUMMARY = "SSH (Secure Shell) common files"
DESCRIPTION = "SSH (Secure Shell) is a program for logging into and executing commands \
on a remote machine. It replaces rsh (rlogin and rsh) and \
provides secure encrypted communication between two untrusted \
hosts over an insecure network. \
 \
xorg-x11 (X Window System) connections and arbitrary TCP/IP ports can \
also be forwarded over the secure channel. \
 \
This package contains common files for the Secure Shell server and \
clients."
LICENSE = "BSD-2-Clause & MIT"

PV = "9.3p2"

RPM_NAME = "openssh-common-9.3p2-1.1.aarch64.rpm"
RPM_HASH = "b5d019e1b345f7635e1a8371160487a2e4c6fff4c04d1032935855c19a980ea39d72849a8a8c650deadcb80383e2eb2128b5930ce09d129a6ab5443b303e6ad8"

RPROVIDES:${PN} += "openssh-common"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libselinux.so.1 \
libz.so.1"

inherit rpm
