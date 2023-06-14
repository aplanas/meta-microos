SUMMARY = "Utilities for inspecting GUID partition tables"
DESCRIPTION = "This subpackage contains the utility programs from libvsgpt to \
inspect GUID partition tables."
LICENSE = "LGPL-3.0-or-later"

PV = "20221029"

RPM_NAME = "libvsgpt-tools-20221029-3.7.aarch64.rpm"
RPM_HASH = "d90531b93a2c1d10f185ac704591f302f5cf0d631d1c4d64dd25b31eeec945d1153279129828ae657f1aa9df754b37965af6c6224e18560016167ecfeb6c2dc7"

RPROVIDES:${PN} += "libvsgpt-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfguid.so.1 \
libvsgpt.so.1"

inherit rpm
