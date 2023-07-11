SUMMARY = "Remote control program for Pentax DSLR cameras"
DESCRIPTION = "pkTriggerCord is a remote control program for Pentax DSLR cameras."
LICENSE = "LGPL-3.0-only"

PV = "0.85.00+git.20220806"

RPM_NAME = "pkTriggerCord-0.85.00+git.20220806-1.4.aarch64.rpm"
RPM_HASH = "690e0da5d5c448320ba964ab4f10b395ee4970d68d60b2a366065323d6499518d1fabf35347e99af47ee737fbe7665d822357719ad1108e185224f6344b504ae"

RPROVIDES:${PN} += "pkTriggerCord"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6"

inherit rpm
