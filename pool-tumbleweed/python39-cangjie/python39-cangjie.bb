SUMMARY = "A python wrapper to libcangjie"
DESCRIPTION = "Python wrapper to libcangjie, the library implementing the Cangjie input method."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3"

RPM_NAME = "python39-cangjie-1.3-2.6.aarch64.rpm"
RPM_HASH = "63c96b6678d5689e4dede15e461cb47072d5e56acdd2849e930dadfd96e8f8e09cc029c02367f8b2bee87c2f58af7efc10bd272075e12475ad7915b886c2594b"

RPROVIDES:${PN} += "python39-cangjie"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcangjie-data \
libcangjie.so.2 \
python-abi"

inherit rpm
