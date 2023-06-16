SUMMARY = "Notepad++-like editor"
DESCRIPTION = "Text editor with support for multiple programming languages, \
multiple encodings, and plugins."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0~20201022T180930.03cdde0"

RPM_NAME = "notepadqq-2.0.0~20201022T180930.03cdde0-1.10.aarch64.rpm"
RPM_HASH = "ddfa416c96c8b7ae3a97a40470b50afec8eca62e2c25b522168a3333cf481de44434d4dd024c9974e12bae3a7ba728f49079ea1d733e89ae92c311cf71fe70eb"

RPROVIDES:${PN} += "notepadqq"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/node \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5WebChannel.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libuchardet.so.0"

inherit rpm
