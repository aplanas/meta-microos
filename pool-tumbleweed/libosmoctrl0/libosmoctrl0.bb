SUMMARY = "Osmocom SNMP-like control interface library"
DESCRIPTION = "libosmocore is a package with various utility functions that were \
originally developed as part of the OpenBSC project. \
 \
libosmoctrl is an SNMP-like control interface. In contrast to the VTY \
interface, the control interface is meant to be used by programs."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmoctrl0-1.8.0-1.1.aarch64.rpm"
RPM_HASH = "6a699f02864e6c34d56ce0766c73b2e08aece01fc659a9b8919fc7676050f29d6710787dcd8df0bc3309990ed24e30e99884ec5fb61480242975924844676044"

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
