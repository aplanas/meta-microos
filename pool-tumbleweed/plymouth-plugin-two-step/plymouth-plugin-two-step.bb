SUMMARY = "Plymouth 'two-step' plugin"
DESCRIPTION = "This package contains the 'two-step' boot splash plugin for \
Plymouth. It features a two phased boot process that starts with \
a progressing animation synced to boot time and finishes with a \
short, fast one-shot animation."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-two-step-22.02.122+94.4bd41a3-10.1.aarch64.rpm"
RPM_HASH = "638d2ebc73b3e9bce390ed02cb2b6e06f8c9fc1a9793973dc679d9033ad897d1cfb2bfd9c434accff4e7cea87fa211e15c0cd5db7ca0bd05fafdcd9969fe104b"

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
