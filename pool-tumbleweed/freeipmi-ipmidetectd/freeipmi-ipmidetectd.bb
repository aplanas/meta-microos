SUMMARY = "IPMI node detection monitoring daemon"
DESCRIPTION = "This service detects and monitors IPMI nodes."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.10"

RPM_NAME = "freeipmi-ipmidetectd-1.6.10-1.3.aarch64.rpm"
RPM_HASH = "533cbe6d44e185945005f1f844b2e03693a3703da9ed585d92b717b2c4309dd55a898068f0111a910c26ff0ab7423477930286035a2ebd98eec2413f0dcef17a"

RPROVIDES:${PN} += "config-freeipmi-ipmidetectd \
freeipmi-ipmidetectd"

RDEPENDS:${PN} += "/usr/bin/sh \
freeipmi \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreeipmi.so.17 \
systemd"

inherit rpm
