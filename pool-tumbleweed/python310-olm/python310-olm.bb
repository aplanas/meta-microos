SUMMARY = "Double Ratchet cryptographic library"
DESCRIPTION = "An implementation of the Double Ratchet cryptographic ratchet \
in C and C++, including an implementation of the Megolm cryptographic ratchet . \
This package contains python310 bindings for olm."
LICENSE = "Apache-2.0"

PV = "3.2.15"

RPM_NAME = "python310-olm-3.2.15-1.1.aarch64.rpm"
RPM_HASH = "51c8421bd5bab14e72f23d68805d300b38a18156353bf0109cafd706338dc090f92bab2daeab53572ac0754c4825f45c6f14a02feb8473206faaa966e1d1cad7"

RPROVIDES:${PN} += "python3.10dist-python-olm \
python310-olm \
python3dist-python-olm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libolm.so.3 \
libolm3 \
python-abi \
python310-cffi"

inherit rpm
