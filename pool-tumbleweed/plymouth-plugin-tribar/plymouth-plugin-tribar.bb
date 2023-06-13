SUMMARY = "Plymouth 'script' plugin"
DESCRIPTION = "This package contains the 'tribar' boot splash plugin for \
Plymouth. It features an extensible, scriptable boot splash \
language that simplifies the process of designing custom \
boot splash themes."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-tribar-22.02.122+94.4bd41a3-5.1.aarch64.rpm"
RPM_HASH = "18c21bf8ade23d0303b4af8feefed98a8446461f3fa345a0d4e3fa6f78c53b404101b9073a94f5ea014a95d6447cfccec734f4a191f863395126283eb796801e"

RPROVIDES:${PN} += "plymouth-plugin-tribar \
plymouth-plugin-tribar(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libply-splash-core.so.5()(64bit) \
libply-splash-core5 \
libply-splash-graphics5 \
libply.so.5()(64bit) \
libply5"

inherit rpm
