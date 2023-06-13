SUMMARY = "Plugin rav1e encoder for AVIF"
DESCRIPTION = "This plugin provides the rav1e encoder for AVIF to libheif. Packaged separately \
so that the libraries it requires are not pulled in by default by libheif."
LICENSE = "GPL-2.0-or-later"

PV = "1.16.2"

RPM_NAME = "libheif-rav1e-1.16.2-1.1.aarch64.rpm"
RPM_HASH = "6fda2f199f924bbbecd2c0377b351878db01d42858fcaf12e124299045ebd217318fe5927c17d3007584f0800692662737393cae7ee582bd18ebceadeba20e1a"

RPROVIDES:${PN} += "libheif-rav1e \
libheif-rav1e(aarch-64) \
libheif-rav1e.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libheif.so.1()(64bit) \
librav1e.so.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
