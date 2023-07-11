SUMMARY = "Python SHA3 wrapper library"
DESCRIPTION = "This is a python wrapper library for SHA-3 (keccak)."
LICENSE = "Python-2.0"

PV = "1.0.2"

RPM_NAME = "python310-pysha3-1.0.2-3.4.aarch64.rpm"
RPM_HASH = "f4531abfe503ea101f9f6f0bc948c2f65ebf62cacc2b078993eafce44846c7789ed509da88adda665ef9afaf682eda88dcf771d2ecc753e9ab5ac37dcfdd9eca"

RPROVIDES:${PN} += "python310-pysha3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
