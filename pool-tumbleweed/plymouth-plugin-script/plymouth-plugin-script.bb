SUMMARY = "Plymouth 'script' plugin"
DESCRIPTION = "This package contains the 'script' boot splash plugin for \
Plymouth. It features an extensible, scriptable boot splash \
language that simplifies the process of designing custom \
boot splash themes."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-script-22.02.122+94.4bd41a3-10.1.aarch64.rpm"
RPM_HASH = "1f2c563fd512d3112fd4b3747d9a04567512c8786ee06a33eecafe4c7fb17cecb6c5aa914174a9747b2d8a3e73231d04db582cee7ff68918ddeaceae5bb014ab"

RPROVIDES:${PN} += "plymouth-plugin-script"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libply-splash-core.so.5 \
libply-splash-core5 \
libply-splash-graphics.so.5 \
libply-splash-graphics5 \
libply.so.5 \
libply5"

inherit rpm
