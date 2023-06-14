SUMMARY = "Shows how a font gets rendered by FreeType"
DESCRIPTION = "Shows how a font gets rendered by FreeType, allowing \
control over virtually all rendering parameters \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "ftinspect-2.13.0-4.1.aarch64.rpm"
RPM_HASH = "0bc0b0fe4fcde657d9c2ceb4e555256adb5912442611f88b2f6e60615dacbd29cc9e26b8053e4d046d57a205d0b9a23de2e80bd6d83c57e843d8020b105bae44"

RPROVIDES:${PN} += "ftinspect"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
