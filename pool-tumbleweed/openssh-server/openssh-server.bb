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

PV = "8.9p1"

RPM_NAME = "openssh-server-8.9p1-9.2.aarch64.rpm"
RPM_HASH = "6144238145909aec55b17df0611043e0d565fe40187328ce37375961df1bf6d13ad2e8ab16c59166ef93ce948e7f67963b5be8c6f50c93ada6b355e99eab7cad"

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
libz.so.1 \
openssh-common \
permissions \
sysuser-shadow"

inherit rpm
