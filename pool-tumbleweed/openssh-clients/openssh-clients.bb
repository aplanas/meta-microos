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

PV = "9.3p2"

RPM_NAME = "openssh-clients-9.3p2-1.1.aarch64.rpm"
RPM_HASH = "034e5e59fd38e67714bedc7e2d08e8d7f124bca28495b8b3378c64ac48ad074072907e5e1d9a3afbcb9054b91e3ec680b1df226e3316ade4255e8f6daeaaa63b"

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
