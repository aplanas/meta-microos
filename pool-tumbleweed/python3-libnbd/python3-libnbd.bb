SUMMARY = "Python 3 bindings for libnbd"
DESCRIPTION = "python3-libnbd contains Python 3 bindings for libnbd."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.1"

RPM_NAME = "python3-libnbd-1.14.1-2.1.aarch64.rpm"
RPM_HASH = "cab371e60cae59460892cf577086ca49f116e86ec0a564f5914f2d90c1acb66c64db8e96e60814303823887448ba8e93a36159db7a34d6e09d01c401f92687db"

RPROVIDES:${PN} += "libnbdmod.cpython-310-aarch64-linux-gnu.so()(64bit) \
python3-libnbd \
python3-libnbd(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libnbd.so.0()(64bit) \
libnbd.so.0(LIBNBD_1.0)(64bit) \
libnbd.so.0(LIBNBD_1.12)(64bit) \
libnbd.so.0(LIBNBD_1.2)(64bit) \
libnbd.so.0(LIBNBD_1.4)(64bit) \
libnbd.so.0(LIBNBD_1.6)(64bit) \
libnbd.so.0(LIBNBD_1.8)(64bit) \
libnbd0 \
python(abi)"

inherit rpm
