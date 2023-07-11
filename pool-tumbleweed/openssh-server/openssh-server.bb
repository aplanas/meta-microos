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

PV = "9.3p1"

RPM_NAME = "openssh-server-9.3p1-1.2.aarch64.rpm"
RPM_HASH = "1cddf2a00fe32208b3bd111e34920a0e11efad677e0c6c795996f51118f60a9ebf612de667a46dd54bb2bf13d347800e200f5823f244d412e8df6fc5877d73cf"

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
