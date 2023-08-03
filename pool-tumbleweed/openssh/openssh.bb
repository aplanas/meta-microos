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

PV = "9.3p2"

RPM_NAME = "openssh-9.3p2-1.1.aarch64.rpm"
RPM_HASH = "5e3a145546f28a1f19de8e146e860c844cf37868063759343d91a08206970785f8bc3eedaef836262b042f0d727f9448b0a231be62d52cb28c4aa3e77ddcb7c6"

RPROVIDES:${PN} += "openssh"

RDEPENDS:${PN} += "findutils \
grep \
openssh-clients \
openssh-server"

inherit rpm
