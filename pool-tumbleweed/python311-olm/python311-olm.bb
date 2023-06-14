SUMMARY = "Double Ratchet cryptographic library"
DESCRIPTION = "An implementation of the Double Ratchet cryptographic ratchet \
in C and C++, including an implementation of the Megolm cryptographic ratchet . \
This package contains python311 bindings for olm."
LICENSE = "Apache-2.0"

PV = "3.2.14"

RPM_NAME = "python311-olm-3.2.14-1.5.aarch64.rpm"
RPM_HASH = "36cc05af13a3edf208ba68503581c55fe1bda7091e00b2df96d642bd18e3db9e8e00a54956c92658fffe3006c5dab1eb879082aded4f556a731d54c42c87bf46"

RPROVIDES:${PN} += "python3.11dist-python-olm \
python311-olm \
python3dist-python-olm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libolm.so.3 \
libolm3 \
python-abi \
python311-cffi \
python311-future"

inherit rpm
