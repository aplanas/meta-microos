SUMMARY = "Shows how a font gets rendered by FreeType"
DESCRIPTION = "Shows how a font gets rendered by FreeType, allowing \
control over virtually all rendering parameters \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.1"

RPM_NAME = "ftinspect-2.13.1-1.1.aarch64.rpm"
RPM_HASH = "d4146545150083df34c5defe4a8660ad2679b2b84d950e1386d71caf6588cc3c6d70a005a7425d63113108deb739cc49b30b17c4b1bd83ceb11dd3bda52e1639"

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
