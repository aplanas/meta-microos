SUMMARY = "A DLZ module which stores zone data in a BerkeleyDB"
DESCRIPTION = "This package provides the externally loadable bdbhpt DLZ driver, without \
update support"
LICENSE = "MPL-2.0"

PV = "9.18.18"

RPM_NAME = "bind-modules-bdbhpt-9.18.18-1.1.aarch64.rpm"
RPM_HASH = "ccc8eb2f5d5c66720698f9cfc1aa383fda8d3653055282de5a3ce7e9cfd9bfb0a2caf893879d0844815b7c29d05800fdd260ff40144510e92bf8ff48ec0a9e07"

RPROVIDES:${PN} += "bind-modules-bdbhpt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so"

inherit rpm
