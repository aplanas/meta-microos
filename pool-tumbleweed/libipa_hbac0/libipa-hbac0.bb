SUMMARY = "FreeIPA HBAC Evaluator library"
DESCRIPTION = "Utility library to validate FreeIPA HBAC rules for authorization \
requests."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "libipa_hbac0-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "0d4eed9e920f9875521757b3ff4b51faab5575ac64a14633c456a2ea7e188655696a7893a9d07362cf49ac5a8ef8bb5463fc948b06631c47d5131e91e8c7e3ce"

RPROVIDES:${PN} += "libipa-hbac.so.0 \
libipa-hbac0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libunistring.so.5"

inherit rpm
