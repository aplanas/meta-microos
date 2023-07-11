SUMMARY = "LIRC client library"
DESCRIPTION = "The LIRC client library. To actually use LIRC the lircd daemon from \
the 'lirc' package has to be configured and started."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.1"

RPM_NAME = "liblirc_client0-0.10.1-10.2.aarch64.rpm"
RPM_HASH = "e6eae739d21e35e8dde00d4ff95c09a13d34ccfcff950668c7bf96eff072b27e5d94294cbff005afb7ff0a2f31aff37ff429272c8c9577dfe960852471eb57d6"

RPROVIDES:${PN} += "liblirc-client.so.0 \
liblirc-client0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
