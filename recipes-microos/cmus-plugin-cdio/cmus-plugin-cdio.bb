SUMMARY = "CDIO plugin for the C* Music Player"
DESCRIPTION = "This package provides CDIO support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.10.0"

RPM_NAME = "cmus-plugin-cdio-2.10.0-1.8.aarch64.rpm"
RPM_HASH = "308d2db3cb9f0ce98f158e696dceed412aee89212b7c5af7af19e22bd910e69dc3f475080cc2065d0eff71ed2e33198ad96a186b0d94d9b49dd3cf39b456b257"

RPROVIDES:${PN} += "cmus-plugin-cdio cmus-plugin-cdio(aarch-64)"
RDEPENDS:${PN} += "cmus ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcddb.so.2()(64bit) libcdio.so.19()(64bit) libcdio.so.19(CDIO_19)(64bit) libcdio_cdda.so.2()(64bit) libcdio_cdda.so.2(CDIO_CDDA_2)(64bit)"

inherit rpm
