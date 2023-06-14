SUMMARY = "Vacuum-IM application statistics collection plugin"
DESCRIPTION = "This plugin needed to collect application statistics."
LICENSE = "GPL-3.0-only"

PV = "1.3.0+git1571036065.9f3952b2"

RPM_NAME = "vacuum-im-plugins-statistics-1.3.0+git1571036065.9f3952b2-1.20.aarch64.rpm"
RPM_HASH = "b1078373411487a9f636ecd6121062dd7b9a29e270c8ddbbd1c1106b8433f692a7d17c69c1723356e1d1b74b1cb800e6df1372e1c2939702b69d96711cf80ab4"

RPROVIDES:${PN} += "libstatistics.so \
vacuum-im-plugins-statistics"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libvacuumutils.so.37 \
libvacuumutils37 \
vacuum-im"

inherit rpm
