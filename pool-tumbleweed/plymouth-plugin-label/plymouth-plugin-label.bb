SUMMARY = "Plymouth label plugin"
DESCRIPTION = "This package contains the label control plugin for \
Plymouth. It provides the ability to render text on \
graphical boot splashes using pango and cairo."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-label-22.02.122+94.4bd41a3-5.1.aarch64.rpm"
RPM_HASH = "2f12698a076368b684c41a4448eb26d5bd573154322de272bfcfb57e5b4727695ba840200d623bee6e130ccee36eb41e714291bbd7057ddbd9094cf80015ee57"

RPROVIDES:${PN} += "plymouth-plugin-label \
plymouth-plugin-label(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgobject-2.0.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libply-splash-core.so.5()(64bit) \
libply-splash-graphics5"

inherit rpm
