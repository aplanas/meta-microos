SUMMARY = "Storage array management library"
DESCRIPTION = "The libStorageMgmt library will provide a vendor agnostic open source storage \
application programming interface (API) that will allow management of storage \
arrays.  The library includes a command line interface for interactive use and \
scripting (command lsmcli).  The library also has a daemon that is used for \
executing plug-ins in a separate process (lsmd)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.8"

RPM_NAME = "libstoragemgmt1-1.9.8-1.2.aarch64.rpm"
RPM_HASH = "9ff82503c72d2e395476d59df43a40b27322cac059af00cd22121463d5ebbbc912cd25347ba8a933e0c9856d6260cdf8898d067bcc317e33445de859721b9f68"

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
