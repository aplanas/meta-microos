SUMMARY = "Tools using libimobiledevice for iOS devices"
DESCRIPTION = "libimobiledevice is a software library that talks the protocols to support \
iOS devices. It does not depend on any existing libraries from Apple."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.3.0+190git.20230705"

RPM_NAME = "imobiledevice-tools-1.3.0+190git.20230705-1.1.aarch64.rpm"
RPM_HASH = "0949f68ed918d26ee6348a0e8b157f72cced3721ef1535564768aff1d7d28f6c5001eec5cea9858ba2065605ee1a16d294b04cdf5ba07feaf1f3e8b8e33e75bf"

RPROVIDES:${PN} += "imobiledevice-tools \
libimobiledevice-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libimobiledevice-1-0-6 \
libimobiledevice-1.0.so.6 \
libimobiledevice-glue-1.0.so.0 \
libplist-2.0.so.4 \
libusbmuxd-2.0.so.6"

inherit rpm
