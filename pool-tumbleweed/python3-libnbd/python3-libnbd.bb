SUMMARY = "Python 3 bindings for libnbd"
DESCRIPTION = "python3-libnbd contains Python 3 bindings for libnbd."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.1"

RPM_NAME = "python3-libnbd-1.14.1-2.1.aarch64.rpm"
RPM_HASH = "cab371e60cae59460892cf577086ca49f116e86ec0a564f5914f2d90c1acb66c64db8e96e60814303823887448ba8e93a36159db7a34d6e09d01c401f92687db"

RPROVIDES:${PN} += "libnbdmod.cpython-310-aarch64-linux-gnu.so \
python3-libnbd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnbd.so.0 \
libnbd0 \
python-abi"

inherit rpm
