SUMMARY = "A DLZ module which stores zone data in a BerkeleyDB"
DESCRIPTION = "This package provides the externally loadable bdbhpt DLZ driver, without \
update support"
LICENSE = "MPL-2.0"

PV = "9.18.17"

RPM_NAME = "bind-modules-bdbhpt-9.18.17-1.2.aarch64.rpm"
RPM_HASH = "cfc87353fe9edb30625996987033ccec9f8486d38f7843b1f4783666a58e2f6e17df826b1e15f3796b62269bf6ed514b5ba8ec34f63de10175d0ca437aa57512"

RPROVIDES:${PN} += "bind-modules-bdbhpt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so"

inherit rpm
