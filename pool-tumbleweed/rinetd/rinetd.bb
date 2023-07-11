SUMMARY = "TCP Redirection Server"
DESCRIPTION = "rinetd redirects TCP connections from one IP address and port to \
another address and port. rinetd is a single-process server which \
handles any number of connections to the address or port pairs \
specified in the file /etc/rinetd.conf. Because rinetd runs as a single \
process using nonblocking I/O, it is able to redirect a large number of \
connections without a severe impact on the machine. This makes it \
practical to run TCP services on machines inside an IP masquerading \
firewall. \
 \
Note: rinetd can not redirect FTP because FTP requires more than one \
socket."
LICENSE = "GPL-2.0-or-later"

PV = "0.62"

RPM_NAME = "rinetd-0.62-26.9.aarch64.rpm"
RPM_HASH = "7b4fc163c3da4a200cbe123f0268a601ae91c22d76698b918e3a61d228b50a0969058d04954e2f78a2bf684f43da8dd068726dad7f48c36b708f9c20a9684e6b"

RPROVIDES:${PN} += "config-rinetd \
rinetd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
