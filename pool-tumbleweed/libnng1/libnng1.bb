SUMMARY = "Shared library for nng"
DESCRIPTION = "nng (nanomsg next-generation) is a C socket library providing \
several common communication patterns."
LICENSE = "MIT"

PV = "1.5.2"

RPM_NAME = "libnng1-1.5.2-1.9.aarch64.rpm"
RPM_HASH = "a2360428cdb67b251307394d7cd23de8ffa69cf95d78e793542cf27c801f5c16abeb8fc7e75e5ca0623589934e36ab707ff8b6fffa9a8845607f9e1def8e0ed6"

RPROVIDES:${PN} += "libnng.so.1 \
libnng1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
