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

PV = "9.3p1"

RPM_NAME = "openssh-9.3p1-1.2.aarch64.rpm"
RPM_HASH = "29ffd97ef58f173d20cc0cb4c493a909d03ad72df7c360083b7bf6db0c6af67a6bf5b6acbf159efb614bfd98b3f493545f9fb7632093c9b1cfd86a530b291469"

RPROVIDES:${PN} += "openssh"

RDEPENDS:${PN} += "findutils \
grep \
openssh-clients \
openssh-server"

inherit rpm
