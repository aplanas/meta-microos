SUMMARY = "Plymouth 'Fade-Throbber' plugin"
DESCRIPTION = "This package contains the 'Fade-In' boot splash plugin for \
Plymouth. It features a centered image that fades in and out \
while other images pulsate around during system boot up."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-fade-throbber-22.02.122+94.4bd41a3-9.1.aarch64.rpm"
RPM_HASH = "65faf7d2e33e292ae8a006e0efe10b7163994aba2ca20acc160b640ecabb9335c1b0ad8035f2bbf4588a9eb1d154d9036512b381785b93c8168c4f4f4c120b86"

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
