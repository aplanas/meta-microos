SUMMARY = "Plymouth label plugin"
DESCRIPTION = "This package contains the label control plugin for \
Plymouth. It provides the ability to render text on \
graphical boot splashes using pango and cairo."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-label-22.02.122+94.4bd41a3-5.1.aarch64.rpm"
RPM_HASH = "2f12698a076368b684c41a4448eb26d5bd573154322de272bfcfb57e5b4727695ba840200d623bee6e130ccee36eb41e714291bbd7057ddbd9094cf80015ee57"

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
