SUMMARY = "A DLZ module which stores zone data in a BerkeleyDB"
DESCRIPTION = "This package provides the externally loadable bdbhpt DLZ driver, without \
update support"
LICENSE = "MPL-2.0"

PV = "9.18.16"

RPM_NAME = "bind-modules-bdbhpt-9.18.16-2.1.aarch64.rpm"
RPM_HASH = "21eddce94fb6b90cd161d1dfeae56a831cc97e2552ccaf83d40e55f706ef8a9469a837d0f502565f44c6c7d7f3b52221c5dc30a9d2ba3492f9d753336ecd8c74"

RPROVIDES:${PN} += "bind-modules-bdbhpt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so"

inherit rpm
