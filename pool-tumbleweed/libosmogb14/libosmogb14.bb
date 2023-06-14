SUMMARY = "Osmocom GPRS Gb Interface (NS/BSSGP) library"
DESCRIPTION = "libosmocore is a package with various utility functions that were \
originally developed as part of the OpenBSC project. \
 \
The libosmogb library contains a GPRS BSSGP protocol implementation."
LICENSE = "AGPL-3.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmogb14-1.8.0-1.1.aarch64.rpm"
RPM_HASH = "0f3137ea4331240dd45e9f4ee48634f2e5f6dba9ef196f18c94e15307758f4b5611830ec14a989ae2d97f0525f8847157a16db073600918d01f1ff2692a2bafe"

RPROVIDES:${PN} += "libosmogb.so.14 \
libosmogb14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmocore.so.20 \
libosmogsm.so.18 \
libosmovty.so.9 \
libtalloc.so.2"

inherit rpm
