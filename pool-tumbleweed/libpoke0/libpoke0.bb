SUMMARY = "Support library for poke"
DESCRIPTION = "Contains support library for poke."
LICENSE = "GPL-3.0-or-later"

PV = "3.2"

RPM_NAME = "libpoke0-3.2-1.1.aarch64.rpm"
RPM_HASH = "93f4f0e73428a98763a511ce3983a36eec7db8259c0052f35e9d877d4cf689896ed37b7164a635d8b9376f845be480c1749806e87dadb1953f46083496499e01"

RPROVIDES:${PN} += "libpoke.so.0()(64bit) \
libpoke0 \
libpoke0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgc.so.1()(64bit) \
libnbd.so.0()(64bit)"

inherit rpm
