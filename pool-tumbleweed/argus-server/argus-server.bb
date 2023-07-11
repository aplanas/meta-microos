SUMMARY = "Daemon for Network Monitoring Tool"
DESCRIPTION = "Daemon for Argus network monitoring tool."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only & MIT"

PV = "3.0.8.3"

RPM_NAME = "argus-server-3.0.8.3-3.4.aarch64.rpm"
RPM_HASH = "a7cabd0fcf384f1dd9f639992f5c6961159577ade6f21c6defd5012676d97274bc599fd10c7a57e78ca296fcc490a958753b4fe2ad0a6a019d843a3920a4b6f0"

RPROVIDES:${PN} += "argus-/usr/sbin/argus \
argus-server \
config-argus-server"

RDEPENDS:${PN} += "/usr/bin/sh \
argus \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpcap.so.1 \
libwrap.so.0"

inherit rpm
