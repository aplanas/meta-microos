SUMMARY = "Plymouth 'Fade-Throbber' plugin"
DESCRIPTION = "This package contains the 'Fade-In' boot splash plugin for \
Plymouth. It features a centered image that fades in and out \
while other images pulsate around during system boot up."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-fade-throbber-22.02.122+94.4bd41a3-6.1.aarch64.rpm"
RPM_HASH = "be9e4cacb4ad77eb7e45070b4d71cb14c351ae369500feb76cf0f4f69b02c89bde555ca0fcc49b52bd23ea699bf9d2164a0526dfb6f2f1f35564645a49da7f2c"

RPROVIDES:${PN} += "plymouth-plugin-fade-throbber"

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
