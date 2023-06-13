SUMMARY = "Library for handling Apple Binary and XML Property Lists -- Python Bindings"
DESCRIPTION = "libplist is a library for handling Apple Binary and XML Property Lists. \
 \
This package contains the python bindings."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "python3-plist-2.2.0-4.7.aarch64.rpm"
RPM_HASH = "75d274e5684a51035108f4de500113cb22f499ae268f15453687b4536f7a125ba8ab62475538b5ba88492f8ba0eca094c5e532bab78b92c104911bba8837718b"

RPROVIDES:${PN} += "python3-plist \
python3-plist(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libplist-2.0.so.3()(64bit) \
libplist-2_0-3 \
libpython3.10.so.1.0()(64bit) \
python(abi) \
python3-Cython"

inherit rpm
