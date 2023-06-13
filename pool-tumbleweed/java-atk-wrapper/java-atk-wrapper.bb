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

RPM_NAME = "java-atk-wrapper-0.38.0-3.7.aarch64.rpm"
RPM_HASH = "2c531a1b3603cd1545006daa2b30c308706adc2f1302ec2f49fa66e0d3f65376061fd754728ed002bbb4008a51baaed405409e8734cbaec5230ff90c4ae58eac"

RPROVIDES:${PN} += "java-atk-wrapper \
java-atk-wrapper(aarch-64) \
libatk-wrapper.so()(64bit)"

RDEPENDS:${PN} += "java \
ld-linux-aarch64.so.1()(64bit) \
libatk-1.0.so.0()(64bit) \
libatk-bridge-2.0.so.0()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
xprop"

inherit rpm
