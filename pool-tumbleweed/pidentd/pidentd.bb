SUMMARY = "An Implementation of the RFC1413 Identification Server"
DESCRIPTION = "This package contains identd, which implements a RFC1413 identification \
server.  Identd looks up specific TCP/IP connections and returns the \
user name and other information about the connection."
LICENSE = "SUSE-Public-Domain"

PV = "3.0.19"

RPM_NAME = "pidentd-3.0.19-6.1.aarch64.rpm"
RPM_HASH = "60ffe80c8b9aeb16dd1bf3d141ca2dba569b5b1d2fe561efed58430f3d84415b008d3e92b0d7023651582ebb155b9fe3a531e53d2300dd62dcd96e10ef5d4143"

RPROVIDES:${PN} += "config(pidentd) \
pidentd \
pidentd(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
