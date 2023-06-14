SUMMARY = "Plymouth 'breeze' plugin"
DESCRIPTION = "This package contains the 'breeze' boot splash plugin for \
Plymouth. It features an extensible, scriptable boot splash \
language that simplifies the process of designing custom \
boot splash themes."
LICENSE = "GPL-2.0+"

PV = "5.27.5"

RPM_NAME = "plymouth-theme-breeze-plugin-breeze-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "aff8dddd178391b0d56ed3a8f6067364fd103f452e0816654b277845fb8276af5efd9c404c7a2bb43eeaed908af3d5d2de71e3397d99931d66c9b18e1a1c1fbb"

RPROVIDES:${PN} += "plymouth-theme-breeze-plugin-breeze"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
libply-splash-core.so.5 \
libply.so.5"

inherit rpm
