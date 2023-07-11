SUMMARY = "Shared library for nanomsg"
DESCRIPTION = "nanomsg is a C socket library providing several common communication \
patterns."
LICENSE = "MIT"

PV = "1.2"

RPM_NAME = "libnanomsg6-1.2-1.4.aarch64.rpm"
RPM_HASH = "020f3039544ccbffeed0f6d6c1954d3f51aa537576863533e95e9601adb8c578aee7b0873c7f56281fae71a18cb89fe0354040e811e3506b58932138bb5eab8a"

RPROVIDES:${PN} += "libnanomsg.so.6 \
libnanomsg6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
