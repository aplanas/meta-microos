SUMMARY = "Storage array management library"
DESCRIPTION = "The libStorageMgmt library will provide a vendor agnostic open source storage \
application programming interface (API) that will allow management of storage \
arrays.  The library includes a command line interface for interactive use and \
scripting (command lsmcli).  The library also has a daemon that is used for \
executing plug-ins in a separate process (lsmd)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.8"

RPM_NAME = "libstoragemgmt1-1.9.8-1.1.aarch64.rpm"
RPM_HASH = "88519a2c443a23d4dcec479093c58cc9873d8b954f1883657b6b7418fcfd16c043712583949b59d49f2f0ab4feb8f44243ce3f47f2d5f762eb291a2aac02717b"

RPROVIDES:${PN} += "libstoragemgmt.so.1 \
libstoragemgmt1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libstdc++.so.6 \
libudev.so.1"

inherit rpm
