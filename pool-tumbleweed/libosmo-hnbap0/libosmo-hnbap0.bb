SUMMARY = "Home Node B Application Part library"
DESCRIPTION = "Osmocom code for the Home Node B Application Part. HNBAP is a control protocol \
found in Home Node B networks on the Iu-h interface."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "libosmo-hnbap0-1.4.0-1.1.aarch64.rpm"
RPM_HASH = "d1c0a27b9838f2eff23ee068586fef19965c19ade6b6c8319f3db283fb44d14a5344ec349e25f0400ca1e793800d6de489d14cc39426ce79486aceb58835ec54"

RPROVIDES:${PN} += "libosmo-hnbap.so.0 \
libosmo-hnbap0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasn1c.so.1 \
libc.so.6 \
libosmocore.so.20 \
libtalloc.so.2"

inherit rpm
