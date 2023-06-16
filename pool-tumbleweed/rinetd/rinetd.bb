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

RPM_NAME = "rinetd-0.62-26.8.aarch64.rpm"
RPM_HASH = "5f1d4f9660b802905f26f1ad82dde6ae7c6899752c1234f0d680fa8acaf4186cda7a8e478977f684ce53a03eb19703fbac4f093f9ec456ac329b1c170b383080"

RPROVIDES:${PN} += "config-rinetd \
rinetd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
