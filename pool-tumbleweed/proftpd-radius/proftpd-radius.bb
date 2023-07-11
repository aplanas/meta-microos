SUMMARY = "Radius Module for ProFTPD"
DESCRIPTION = "This is the Radius Module for ProFTPD"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.7f"

RPM_NAME = "proftpd-radius-1.3.7f-1.4.aarch64.rpm"
RPM_HASH = "fa08648f9a89a2b663f55f422581cad37eb81396bcfbb826fa34506bb185d4fed70eb85bd8db3f2c728d0340f7af131d82b41820135e5fc287a8ae8fbfde3d4d"

RPROVIDES:${PN} += "proftpd-radius"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
proftpd"

inherit rpm
