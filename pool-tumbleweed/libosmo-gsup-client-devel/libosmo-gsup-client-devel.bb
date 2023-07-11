SUMMARY = "Development files for the Osmocom GSUP client library"
DESCRIPTION = "This is a shared library that can be used to implement client programs for \
the GSUP protocol. The typical GSUP server is OsmoHLR, with OsmoMSC, OsmoSGSN \
and External USSD Entities (EUSEs) using this library to implement clients. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmo-gsup-client."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "libosmo-gsup-client-devel-1.4.0-1.12.aarch64.rpm"
RPM_HASH = "0ac7fb175952e40a29d573894f6867492eecade3b681f974ac29e0d4787e3f85525590c1dc8369b6c3c51bd7f06aadee11ceb79b5a6904465ae8876c660c350e"

RPROVIDES:${PN} += "libosmo-gsup-client-devel \
pkgconfig-libosmo-gsup-client"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmo-gsup-client.so.0 \
libosmo-gsup-client0 \
libosmocore.so.20 \
libosmogsm.so.18 \
libtalloc.so.2"

inherit rpm
