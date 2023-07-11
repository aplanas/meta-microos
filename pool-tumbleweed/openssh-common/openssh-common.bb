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

PV = "9.3p1"

RPM_NAME = "openssh-common-9.3p1-1.2.aarch64.rpm"
RPM_HASH = "02759d6d154cf2119dad74b7ff402152bab4ff28a804faa65f847f36b7d0b701e68489d8b65670c1bcd1a217bda62414b850c336e8dd3c550758cd7a8ab8c3fd"

RPROVIDES:${PN} += "openssh-common"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libselinux.so.1 \
libz.so.1"

inherit rpm
