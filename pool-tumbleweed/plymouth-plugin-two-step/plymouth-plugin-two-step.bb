SUMMARY = "Plymouth 'two-step' plugin"
DESCRIPTION = "This package contains the 'two-step' boot splash plugin for \
Plymouth. It features a two phased boot process that starts with \
a progressing animation synced to boot time and finishes with a \
short, fast one-shot animation."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-two-step-22.02.122+94.4bd41a3-9.1.aarch64.rpm"
RPM_HASH = "83e12a78f308f2f567240a9f3619246912eaa5a3cdb2ad888ff8e359534c273ad575e3756ff4698d807bec0319e5bd9bc8a6275f360840cbcc3e9760115005a9"

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
