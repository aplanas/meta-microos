SUMMARY = "Library for reading media metadata (tags)"
DESCRIPTION = "libtaginfo is a convenience wrapper for taglib with C and vala \
bindings."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.1"

RPM_NAME = "libtaginfo_c0-0.2.1-2.5.aarch64.rpm"
RPM_HASH = "f99520605a379681b59f28d16bc56e65adc24e6adcf42a78746236bbe38dba40622140bd0df03e56d50db25572e04cdb97eeba626ca8550d5bac5ba4f61cc819"

RPROVIDES:${PN} += "libtaginfo-c.so.0 \
libtaginfo-c0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtag.so.1 \
libtaginfo.so.1"

inherit rpm
