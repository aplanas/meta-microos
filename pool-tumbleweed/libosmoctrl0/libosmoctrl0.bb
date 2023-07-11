SUMMARY = "Osmocom SNMP-like control interface library"
DESCRIPTION = "libosmocore is a package with various utility functions that were \
originally developed as part of the OpenBSC project. \
 \
libosmoctrl is an SNMP-like control interface. In contrast to the VTY \
interface, the control interface is meant to be used by programs."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmoctrl0-1.8.0-1.2.aarch64.rpm"
RPM_HASH = "ecac29f559bd2e42ad7dd5b5f52a78e055c81bbe7773af3710a7fe9b02970f21399ca8fbce2582bb8ba9c68c3968b01f07eb71b66b5d27484e24f29c527b5e4e"

RPROVIDES:${PN} += "libosmoctrl.so.0 \
libosmoctrl0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmocore.so.20 \
libosmogsm.so.18 \
libosmovty.so.9 \
libtalloc.so.2"

inherit rpm
