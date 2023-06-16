SUMMARY = "A PPP Over Ethernet Redirector for PPPD"
DESCRIPTION = "rp-pppoe is a user-space redirector which permits the use of PPPoE \
(Point-to-Point Protocol Over Ethernet) with Linux. PPPoE is used by \
many ADSL service providers."
LICENSE = "GPL-2.0-or-later"

PV = "4.0"

RPM_NAME = "rp-pppoe-4.0-2.1.aarch64.rpm"
RPM_HASH = "cdd50728208f08c201e9c1a982a638bd9d3a6dec16c44537ff66a9600feeb40aa8d8cbde77298dc68508a873767327aeb4929b0d5b492f25a0198ba3e7738520"

RPROVIDES:${PN} += "config-rp-pppoe \
rp-pppoe"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
group-dialout \
iproute2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
permissions \
ppp"

inherit rpm
