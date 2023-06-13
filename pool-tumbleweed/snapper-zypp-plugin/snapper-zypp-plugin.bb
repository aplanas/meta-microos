SUMMARY = "A zypp commit plugin for calling snapper"
DESCRIPTION = "This package contains a plugin for zypp that makes filesystem snapshots with \
snapper during commits."
LICENSE = "GPL-2.0-only"

PV = "0.10.4"

RPM_NAME = "snapper-zypp-plugin-0.10.4-13.2.aarch64.rpm"
RPM_HASH = "7e898bb3005f0bc750e528f5c08cd3122b635f4d605fb1c1719a336d4ea066974c771f572e11ab6244fa319fad10e9a9c613af9ac902ba099ea0d84d4f475a05"

RPROVIDES:${PN} += "snapper-zypp-plugin \
snapper-zypp-plugin(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libgcc_s.so.1()(64bit) \
libjson-c.so.5()(64bit) \
libsnapper.so.7()(64bit) \
libstdc++.so.6()(64bit) \
libxml2.so.2()(64bit) \
libzypp(plugin:commit) \
snapper"

inherit rpm
