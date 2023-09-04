SUMMARY = "Plymouth label plugin"
DESCRIPTION = "This package contains the label control plugin for \
Plymouth. It provides the ability to render text on \
graphical boot splashes using pango and cairo."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-label-22.02.122+94.4bd41a3-9.1.aarch64.rpm"
RPM_HASH = "df9445c2a1105289fd07bd7d0f7aecd35c6bbbe18156a8dfb3910e4c131683755398d74f17b2c92a6dd1c9eb5d5a8283686abb22d02e34e7be1627be329276bc"

RPROVIDES:${PN} += "plymouth-plugin-label"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgobject-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libply-splash-core.so.5 \
libply-splash-graphics5"

inherit rpm
