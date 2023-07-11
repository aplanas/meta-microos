SUMMARY = "Java ATK Wrapper"
DESCRIPTION = "Java ATK Wrapper is a implementation of ATK by using JNI technic. It \
converts Java Swing events into ATK events, and send these events to \
ATK-Bridge. \
 \
JAW is part of the Bonobo deprecation project. It will replaces the \
former java-access-bridge. \
By talking to ATK-Bridge, it keeps itself from being affected by the \
change of underlying communication mechanism."
LICENSE = "LGPL-2.0-or-later"

PV = "0.38.0"

RPM_NAME = "java-atk-wrapper-0.38.0-3.8.aarch64.rpm"
RPM_HASH = "f182552807c99d3e321a2f944ffdcf19103fbbd4fb6b9d2536f2132433484301592ecf78a826058cc00b8132e1599418d20bc4433f776012ce31b930dd5aed63"

RPROVIDES:${PN} += "java-atk-wrapper \
libatk-wrapper.so"

RDEPENDS:${PN} += "java \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libatk-bridge-2.0.so.0 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
xprop"

inherit rpm
