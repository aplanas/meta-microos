SUMMARY = "MySQL output target for ulogd"
DESCRIPTION = "MySQL output target for ulogd."
LICENSE = "GPL-2.0-only"

PV = "2.0.8"

RPM_NAME = "ulogd-mysql-2.0.8-1.1.aarch64.rpm"
RPM_HASH = "88db7618354b3522af1a08c25b3b7387646f36700038e5fa79df18244e8772d6ab1cfd01d3138f988f2be9c5996f058a73021aded74beacacee9402da6d8f17a"

RPROVIDES:${PN} += "ulogd-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3 \
ulogd"

inherit rpm
