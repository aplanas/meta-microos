SUMMARY = "Secure Shell Client and Server (Remote Login Program)"
DESCRIPTION = "SSH (Secure Shell) is a program for logging into and executing commands \
on a remote machine. It replaces rsh (rlogin and rsh) and \
provides secure encrypted communication between two untrusted \
hosts over an insecure network. \
 \
xorg-x11 (X Window System) connections and arbitrary TCP/IP ports can \
also be forwarded over the secure channel. \
 \
This is a dummy package that pulls in both the client and server \
components."
LICENSE = "BSD-2-Clause & MIT"

PV = "8.9p1"

RPM_NAME = "openssh-8.9p1-9.2.aarch64.rpm"
RPM_HASH = "83f67ff73a2e42a7bc60559e30803797810cd76d024858b2f0630010999494b1cd35055969663f3fb7870d62e1f893e63e0a3edb313cf3228252241dfb2ff585"

RPROVIDES:${PN} += "openssh"

RDEPENDS:${PN} += "findutils \
grep \
openssh-clients \
openssh-server"

inherit rpm
