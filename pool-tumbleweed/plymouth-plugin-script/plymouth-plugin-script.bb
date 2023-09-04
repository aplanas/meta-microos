SUMMARY = "Plymouth 'script' plugin"
DESCRIPTION = "This package contains the 'script' boot splash plugin for \
Plymouth. It features an extensible, scriptable boot splash \
language that simplifies the process of designing custom \
boot splash themes."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-script-22.02.122+94.4bd41a3-9.1.aarch64.rpm"
RPM_HASH = "d3d14ced5ca24995a074e32522b6bd9b1d798e1b1ed57c025f22ca600e881d5d84218c2782566b7fb6fab0c1baf112fda2e37499367018a2da66f98f1fe9a399"

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
