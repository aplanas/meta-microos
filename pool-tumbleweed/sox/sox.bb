SUMMARY = "Sound Conversion Tools"
DESCRIPTION = "SOX is intended to be the Swiss Army knife of sound processing tools. \
It does many things, it just does not do them all well. Sooner or later \
it will come in very handy. SOX is really only usable day-to-day if you \
hide the wacky options with one-line shell scripts."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "14.4.2"

RPM_NAME = "sox-14.4.2-6.2.aarch64.rpm"
RPM_HASH = "022920dc987d3a9c21ab5a886d1df9d8f246d01822bb6264c425b37a4cd7b37468ed640bfe450d21a1932cfe77e5e429f5c7016a8fe46a323b4f1621b057e7b5"

RPROVIDES:${PN} += "sox"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsox.so.3"

inherit rpm
