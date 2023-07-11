SUMMARY = "HTTP destination support for syslog-ng"
DESCRIPTION = "This package provides HTTP destination support for syslog-ng by means \
of libcurl."
LICENSE = "GPL-2.0-only"

PV = "4.2.0"

RPM_NAME = "syslog-ng-curl-4.2.0-2.2.aarch64.rpm"
RPM_HASH = "d9e535d87643b47039926c42fda381bcc8f3ee078d98eeca8157811ccb707fa10955f1d6a0b1104d9f50767be24b693e514663a91df2ab309556d64870c3dece"

RPROVIDES:${PN} += "syslog-ng-curl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libsyslog-ng-4.2.so.0 \
syslog-ng"

inherit rpm
