SUMMARY = "Column-based text sort engine"
DESCRIPTION = "Library to sort human readable column-based text output."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39"

RPM_NAME = "libsmartcols1-2.39-1.1.aarch64.rpm"
RPM_HASH = "44f10dc7cbd55c62e28f823dabaa7e36e256fc05c17c1b5ff633c8ccdb72b2d844fee9a20bfc6aef1101874c79625d1f517d191b945a0718227fec7bbfb73e2c"

RPROVIDES:${PN} += "libsmartcols.so.1 \
libsmartcols1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
