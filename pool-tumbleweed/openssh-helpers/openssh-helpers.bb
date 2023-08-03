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

PV = "9.3p2"

RPM_NAME = "openssh-helpers-9.3p2-1.1.aarch64.rpm"
RPM_HASH = "0090399e700a0b99d416720f016ae17bc1536a12df004cbf89007de25319bc2873818207efb3f4a27d676c18ef342cb92c850013c7446a328c88183c36483a14"

RPROVIDES:${PN} += "config-openssh-helpers \
openssh-helpers"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
openssh-common"

inherit rpm
