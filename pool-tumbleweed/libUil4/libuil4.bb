SUMMARY = "Motif User Interface Language library"
DESCRIPTION = "The Motif user interface language (UIL) is a specification language \
for describing the initial state of a Motif application's user \
interface."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.8"

RPM_NAME = "libUil4-2.3.8-2.5.aarch64.rpm"
RPM_HASH = "282309fdf922f93e482150bfcf5f2e5890a81557a29a030c037eee5f56b56fb5ba7a63704843c7fe60de7f3a420c1c978be38d8ca2fa2a6c072db63aff745000"

RPROVIDES:${PN} += "libUil.so.4 \
libUil4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libMrm.so.4 \
libXm.so.4 \
libXt.so.6 \
libc.so.6"

inherit rpm
