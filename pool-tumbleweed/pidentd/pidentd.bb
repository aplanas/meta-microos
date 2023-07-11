SUMMARY = "An Implementation of the RFC1413 Identification Server"
DESCRIPTION = "This package contains identd, which implements a RFC1413 identification \
server.  Identd looks up specific TCP/IP connections and returns the \
user name and other information about the connection."
LICENSE = "SUSE-Public-Domain"

PV = "3.0.19"

RPM_NAME = "pidentd-3.0.19-6.2.aarch64.rpm"
RPM_HASH = "89eed8c3a0e003c5b7d3dc81adda0bd17e8a7d6c056a8498db586eb9fad72044224eef06388f8ad0a00280511b1176c8434df8e4a65c94f2f85b64ece8623b06"

RPROVIDES:${PN} += "config-pidentd \
pidentd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
