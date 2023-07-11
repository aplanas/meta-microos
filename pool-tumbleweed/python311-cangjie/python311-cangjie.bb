SUMMARY = "A python wrapper to libcangjie"
DESCRIPTION = "Python wrapper to libcangjie, the library implementing the Cangjie input method."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3"

RPM_NAME = "python311-cangjie-1.3-2.6.aarch64.rpm"
RPM_HASH = "45c64d830a54689131638ef59f07349c77476349fa34ee14944ea47e3e8722df86271b9508af014d6b57f5eb4fc476728192a6325e09118d2bc5193b2ee8bba7"

RPROVIDES:${PN} += "python3-cangjie \
python311-cangjie"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcangjie-data \
libcangjie.so.2 \
python-abi"

inherit rpm
