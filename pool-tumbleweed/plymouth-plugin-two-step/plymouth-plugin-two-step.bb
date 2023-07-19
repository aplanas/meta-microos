SUMMARY = "Plymouth 'two-step' plugin"
DESCRIPTION = "This package contains the 'two-step' boot splash plugin for \
Plymouth. It features a two phased boot process that starts with \
a progressing animation synced to boot time and finishes with a \
short, fast one-shot animation."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-two-step-22.02.122+94.4bd41a3-6.1.aarch64.rpm"
RPM_HASH = "e6ea23928c9bc89f33112875ae1646bd977ea02cbcd508012c61c44b21e01e5b261c86c6c768909f0c45a486850293ebc69508f6d17ae793147e07a729525e18"

RPROVIDES:${PN} += "plymouth-plugin-two-step"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libply-splash-core.so.5 \
libply-splash-core5 \
libply-splash-graphics.so.5 \
libply-splash-graphics5 \
libply.so.5 \
libply5 \
plymouth-plugin-label"

inherit rpm
