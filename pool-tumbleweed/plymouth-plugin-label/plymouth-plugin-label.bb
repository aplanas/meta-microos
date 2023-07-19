SUMMARY = "Plymouth label plugin"
DESCRIPTION = "This package contains the label control plugin for \
Plymouth. It provides the ability to render text on \
graphical boot splashes using pango and cairo."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-label-22.02.122+94.4bd41a3-6.1.aarch64.rpm"
RPM_HASH = "c628a996c0a4be0e8a163db58561a433f1e7eec5e5260835fd51353ae247c13486eeb721c5ed003134a0da548ddc7c0f081380ae9ff1eaac91dc632585086fae"

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
