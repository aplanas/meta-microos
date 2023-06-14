SUMMARY = "Motif User Interface Language library"
DESCRIPTION = "The Motif user interface language (UIL) is a specification language \
for describing the initial state of a Motif application's user \
interface."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.8"

RPM_NAME = "libUil4-2.3.8-2.4.aarch64.rpm"
RPM_HASH = "8de697391d6775802661c91ec3e4e7019ad7aeb020b630e8ebf0ee1c9fff78cabdd1190972696ccfc69eb46363e24fb390056cff81c941c90bfa73073bd47f08"

RPROVIDES:${PN} += "libUil.so.4 \
libUil4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libMrm.so.4 \
libXm.so.4 \
libXt.so.6 \
libc.so.6"

inherit rpm
