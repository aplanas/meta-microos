SUMMARY = "Utilities for inspecting GUID partition tables"
DESCRIPTION = "This subpackage contains the utility programs from libvsgpt to \
inspect GUID partition tables."
LICENSE = "LGPL-3.0-or-later"

PV = "20221029"

RPM_NAME = "libvsgpt-tools-20221029-3.7.aarch64.rpm"
RPM_HASH = "d90531b93a2c1d10f185ac704591f302f5cf0d631d1c4d64dd25b31eeec945d1153279129828ae657f1aa9df754b37965af6c6224e18560016167ecfeb6c2dc7"

RPROVIDES:${PN} += "libvsgpt-tools \
libvsgpt-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libcnotify.so.1()(64bit) \
libcnotify.so.1(V_20220108)(64bit) \
libfguid.so.1()(64bit) \
libfguid.so.1(V_20220113)(64bit) \
libvsgpt.so.1()(64bit) \
libvsgpt.so.1(V_20221029)(64bit)"

inherit rpm
