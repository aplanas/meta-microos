SUMMARY = "Archiving tool for arc achives"
DESCRIPTION = "This package allows you to unpack *.arc file"
LICENSE = "GPL-2.0-only"

PV = "5.21q"

RPM_NAME = "arc-5.21q-6.12.aarch64.rpm"
RPM_HASH = "f6ac2e664da88734af313b7778e902aae45f51c7e208f688821e72d9379ad988dc369339ec7c0e6bd5f3b1c18b472ddcaf67d2f8d77438a35f5c9a70bea6e551"

RPROVIDES:${PN} += "arc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
