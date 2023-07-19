SUMMARY = "Plymouth 'script' plugin"
DESCRIPTION = "This package contains the 'script' boot splash plugin for \
Plymouth. It features an extensible, scriptable boot splash \
language that simplifies the process of designing custom \
boot splash themes."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-script-22.02.122+94.4bd41a3-6.1.aarch64.rpm"
RPM_HASH = "6e93cdf7cc3e1048fd16044bb114c9964d4ff4a2d319a9c9c8f80aa472d4e3bf13257412a1d555d473ced9e1467a8c586be298f6d330b4a4579546a0e303f520"

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
