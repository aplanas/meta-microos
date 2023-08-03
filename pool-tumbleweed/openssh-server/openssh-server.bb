SUMMARY = "SSH (Secure Shell) server"
DESCRIPTION = "SSH (Secure Shell) is a program for logging into and executing commands \
on a remote machine. It replaces rsh (rlogin and rsh) and \
provides secure encrypted communication between two untrusted \
hosts over an insecure network. \
 \
xorg-x11 (X Window System) connections and arbitrary TCP/IP ports can \
also be forwarded over the secure channel. \
 \
This package contains the Secure Shell daemon, which allows clients to \
securely connect to your server."
LICENSE = "BSD-2-Clause & MIT"

PV = "9.3p2"

RPM_NAME = "openssh-server-9.3p2-1.1.aarch64.rpm"
RPM_HASH = "94c4d940571ab6d5acc1af54f5ead359dc3e3868cb79353c85acd490d6a30cf3f3b94b8921364902b7c2fd933d6d4c1944253273695ad384d47d99b705549c7f"

RPROVIDES:${PN} += "config-openssh-server \
group-sshd \
openssh-/usr/sbin/sshd \
openssh-server \
user-sshd"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
findutils \
grep \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libc.so.6 \
libcom-err.so.2 \
libcrypt.so.1 \
libcrypto.so.3 \
libfido2.so.1 \
libgssapi-krb5.so.2 \
libkrb5.so.3 \
libpam.so.0 \
libselinux.so.1 \
libsystemd.so.0 \
libwtmpdb.so.0 \
libz.so.1 \
openssh-common \
permissions \
sysuser-shadow"

inherit rpm
