SUMMARY = "Unicode/Charset conversion library for twin"
DESCRIPTION = "Unicode <-> charset conversion routines for twin."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "0.9.0+17"

RPM_NAME = "libtutf1-0.9.0+17-3.6.aarch64.rpm"
RPM_HASH = "d980be1efc9a6b2039c6c26bb50310c62a51508338e7ac7adbfbd376e10d607edf817918d5e76fd224cefe233b15691bb59501077e84c5c9c4a18ee14664ea70"

RPROVIDES:${PN} += "libTutf1 \
libtutf.so.1 \
libtutf1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
