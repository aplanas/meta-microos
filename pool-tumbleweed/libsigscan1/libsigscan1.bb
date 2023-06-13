SUMMARY = "Library for binary signature scanning"
DESCRIPTION = "libsigscan is a library for binary signature scanning"
LICENSE = "LGPL-3.0-or-later"

PV = "20230109"

RPM_NAME = "libsigscan1-20230109-1.4.aarch64.rpm"
RPM_HASH = "abff8982f44023cb48a7a8f9def5df3d24efe6ce101f03336524004f8176152d73875a93cecf83ee4714ddc41b5c27ab05dd53bfbbde9d0f04feba218144ce41"

RPROVIDES:${PN} += "libsigscan.so.1()(64bit) \
libsigscan.so.1(V_20230109)(64bit) \
libsigscan1 \
libsigscan1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6()(64bit) \
libcdata.so.1()(64bit) \
libcdata.so.1(V_20230108)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libcnotify.so.1()(64bit) \
libcnotify.so.1(V_20220108)(64bit)"

inherit rpm
