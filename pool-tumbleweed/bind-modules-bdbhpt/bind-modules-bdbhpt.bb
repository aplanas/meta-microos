SUMMARY = "A DLZ module which stores zone data in a BerkeleyDB"
DESCRIPTION = "This package provides the externally loadable bdbhpt DLZ driver, without \
update support"
LICENSE = "MPL-2.0"

PV = "9.18.16"

RPM_NAME = "bind-modules-bdbhpt-9.18.16-3.1.aarch64.rpm"
RPM_HASH = "e7ee70bb4f638bd34a230f4f72b026d19bb1bdf3e6ad2fc552aa821c66844a92e3e40f0f653f587cf6362b24face9ee626f41086417c170a1d9f46324681a766"

RPROVIDES:${PN} += "bind-modules-bdbhpt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so"

inherit rpm
