SUMMARY = "Vacuum-IM application statistics collection plugin"
DESCRIPTION = "This plugin needed to collect application statistics."
LICENSE = "GPL-3.0-only"

PV = "1.3.0+git1571036065.9f3952b2"

RPM_NAME = "vacuum-im-plugins-statistics-1.3.0+git1571036065.9f3952b2-1.21.aarch64.rpm"
RPM_HASH = "9513ab4ddb7939ded108e9fdab073391bd89b57a7d80827b83c505182d8c28d5e8e19a3bcf70b479eb6b5e3d9f29723c2a72b36ffccde1b55aeedd259c6efaa2"

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
