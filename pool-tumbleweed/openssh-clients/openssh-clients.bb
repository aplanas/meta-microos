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

PV = "8.9p1"

RPM_NAME = "openssh-clients-8.9p1-9.2.aarch64.rpm"
RPM_HASH = "f09c502e226cedb13527aa05a183b74b35d88ba501e50b6df78a3a92db1717433d4e58b95cffebe04392b46366d8df8ae87437e33b1e2593fb9e244429546e9c"

RPROVIDES:${PN} += "openssh-/usr/bin/ssh \
openssh-clients"

RDEPENDS:${PN} += "/bin/sh \
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
