SUMMARY = "IPMI Service Processor, BMC management tool"
DESCRIPTION = "This project provides 'Remote-Console' (out-of-band) and \
'System Management Software' (in-band) based on Intelligent \
Platform Management Interface specification."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.11"

RPM_NAME = "freeipmi-1.6.11-1.1.aarch64.rpm"
RPM_HASH = "3eb3fdac22e92cec82c58243b63fb3386671a08584a066f70538a07135be9c93c7a563f5c0b984ea0798cb18555309b6ae13a6be031b9e1f3dcaa89166680343"

RPROVIDES:${PN} += "config-freeipmi \
freeipmi \
freeipmi-ipmimonitoring"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
info \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreeipmi.so.17 \
libipmiconsole.so.2 \
libipmidetect.so.0"

inherit rpm
