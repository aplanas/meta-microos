SUMMARY = "Router ADVertisement Daemon for IPv6"
DESCRIPTION = "RADVD is the Router ADVertisement Daemon. It sends IPv6 RA packets \
to advertise available IPv6 networks, and is used for automated \
configuration of IPv6 clients."
LICENSE = "BSD-3-Clause"

PV = "2.19"

RPM_NAME = "radvd-2.19-3.4.aarch64.rpm"
RPM_HASH = "b64de2cba5b67003465249a7edae54c3a3d6edf30aca4ff0a677e6b1e7cd636cd255739ea12ee491c9732b69f1a989fa214cc0295f49abcb4b40c8bc6e90c457"

RPROVIDES:${PN} += "config-radvd \
group-radvd \
radvd \
user-radvd"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
group-daemon \
ld-linux-aarch64.so.1 \
libc.so.6 \
sysuser-shadow"

inherit rpm
