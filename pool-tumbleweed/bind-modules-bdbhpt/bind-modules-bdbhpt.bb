SUMMARY = "A DLZ module which stores zone data in a BerkeleyDB"
DESCRIPTION = "This package provides the externally loadable bdbhpt DLZ driver, without \
update support"
LICENSE = "MPL-2.0"

PV = "9.18.17"

RPM_NAME = "bind-modules-bdbhpt-9.18.17-1.1.aarch64.rpm"
RPM_HASH = "0e1748fae244d0c0a38d56cd3f6aeb25f346733491a5ba5c0d6f474fe1f04f3ff51377576e8200cfefb0face37476cfa80289b80c71ff3f6c8ae67d0846a897e"

RPROVIDES:${PN} += "bind-modules-bdbhpt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so"

inherit rpm
