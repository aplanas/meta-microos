SUMMARY = "Shows how a font gets rendered by FreeType"
DESCRIPTION = "Shows how a font gets rendered by FreeType, allowing \
control over virtually all rendering parameters \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "ftinspect-2.13.0-4.2.aarch64.rpm"
RPM_HASH = "f0df9ad947634c1d939fabeb7bf0a5b582b8518d9a078a7732e86ae4dc997518964ad1584e89bf4d21f5eae0eb00ba9bef2060797201ff0583c3b4a53f1a31a5"

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
