SUMMARY = "RANAP User Adaption signalling library"
DESCRIPTION = "Osmocom code for the RANAP User Adaption signalling."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "libosmo-rua0-1.4.0-1.1.aarch64.rpm"
RPM_HASH = "2fb950ae1a79b3093da88b1569f4957fd3f3fb7ee9f6498de2a63befb3f11405b57938b0442708283cdd058104c94d709a309c95d62623a1332fed14cdd84758"

RPROVIDES:${PN} += "libosmo-rua.so.0 \
libosmo-rua0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasn1c.so.1 \
libc.so.6 \
libosmocore.so.20 \
libtalloc.so.2"

inherit rpm
