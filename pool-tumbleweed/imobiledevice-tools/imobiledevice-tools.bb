SUMMARY = "Tools using libimobiledevice for iOS devices"
DESCRIPTION = "libimobiledevice is a software library that talks the protocols to support \
iOS devices. It does not depend on any existing libraries from Apple."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.3.0+179git.20230430"

RPM_NAME = "imobiledevice-tools-1.3.0+179git.20230430-1.2.aarch64.rpm"
RPM_HASH = "161bc51feb64288c98a724b675872dc92d1afcc4a3a5715161bbd52f5e8318477256ece6f7fa2afdd1fec08a93d3d35512964c771f19371efccc1c256d78ebef"

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
