SUMMARY = "WavPack input plugin for the C* Music Player"
DESCRIPTION = "This package provides WavPack input support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.10.0"

RPM_NAME = "cmus-plugin-wavpack-2.10.0-1.8.aarch64.rpm"
RPM_HASH = "cf5fb3c3858ed203f2ee0dcc88999d0c2bb32a8d62b55b54f64183dbc52d76bfa49c039f3002cdb55f4219ca00d8b98f84eb16cd8fea58646da116008584d8ba"

RPROVIDES:${PN} += "cmus-plugin-wavpack cmus-plugin-wavpack(aarch-64)"
RDEPENDS:${PN} += "cmus ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libwavpack.so.1()(64bit)"

inherit rpm
