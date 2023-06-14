SUMMARY = "A python wrapper to libcangjie"
DESCRIPTION = "Python wrapper to libcangjie, the library implementing the Cangjie input method."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3"

RPM_NAME = "python311-cangjie-1.3-2.4.aarch64.rpm"
RPM_HASH = "344b66ebbd896f5d8b10f1e708ab2e39ce15456219e05021b1399f05909a3b931b949d133192bcb02c2629111145491e6f51cfaae0557bdfb03771804ad5f91f"

RPROVIDES:${PN} += "python311-cangjie"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcangjie-data \
libcangjie.so.2 \
python-abi"

inherit rpm
