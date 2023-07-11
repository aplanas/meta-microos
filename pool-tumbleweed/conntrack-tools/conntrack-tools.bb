SUMMARY = "Userspace tools for interacting with the Connection Tracking System"
DESCRIPTION = "The conntrack/nfct utilities provide the userspace interface to the \
Netfilter connection tracking, replacing \
/proc/net/ip_conntrack. The tools can be used to search, list, \
inspect and maintain the connection tracking subsystem of the Linux \
kernel."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.7"

RPM_NAME = "conntrack-tools-1.4.7-1.4.aarch64.rpm"
RPM_HASH = "423da7edba8f4cb95fc26914311fdd43a5382b363d0ba1b88f070bae9f5c8fadcc078e43d7a7932d29e8611007a294604782d727474c52e3c72f9486ea1fbaa7"

RPROVIDES:${PN} += "conntrack-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmnl.so.0 \
libnetfilter-conntrack.so.3 \
libnetfilter-cthelper.so.0 \
libnetfilter-cttimeout.so.1"

inherit rpm
