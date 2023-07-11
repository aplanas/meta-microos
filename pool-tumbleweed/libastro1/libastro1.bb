SUMMARY = "Astronomy: Shared Library"
DESCRIPTION = "The astronomy library for the satellites plugin."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libastro1-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "c43c3233381f8cf5ccfa5e28663c4443dcc0fa445392a179a689e8eff42b2bb9b8e6fdbffb0e1678b55543391098c31bf581ed25718d58ce9e1c2f4574cf5f33"

RPROVIDES:${PN} += "libastro-qt5-1 \
libastro.so.1 \
libastro1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmarblewidget-qt5-28 \
libstdc++.so.6"

inherit rpm
