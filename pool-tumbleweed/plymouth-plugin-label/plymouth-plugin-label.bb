SUMMARY = "Plymouth label plugin"
DESCRIPTION = "This package contains the label control plugin for \
Plymouth. It provides the ability to render text on \
graphical boot splashes using pango and cairo."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-label-22.02.122+94.4bd41a3-10.1.aarch64.rpm"
RPM_HASH = "4a589d880c5c113b2a9e72c841f2788a047ab1c287b5af7f872f12f2440c377e35eab8ec6c5fb675115f06cce9314fc54ad36f927928b71361a3c7d01edc4b31"

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
