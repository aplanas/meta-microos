SUMMARY = "Python SHA3 wrapper library"
DESCRIPTION = "This is a python wrapper library for SHA-3 (keccak)."
LICENSE = "Python-2.0"

PV = "1.0.2"

RPM_NAME = "python39-pysha3-1.0.2-3.4.aarch64.rpm"
RPM_HASH = "e86f5bd04593ad7f046f00e9e255e0943796749ce0c683631c9db5ec0717cd1ee30c412a4b5c68c7a6d96c311448f80aab5776de192009460380f6952305b53b"

RPROVIDES:${PN} += "python39-pysha3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
