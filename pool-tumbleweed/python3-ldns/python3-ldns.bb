SUMMARY = "Python3 bindings for ldns"
DESCRIPTION = "Python bindings for the ldns library"
LICENSE = "BSD-3-Clause"

PV = "1.8.3"

RPM_NAME = "python3-ldns-1.8.3-1.7.aarch64.rpm"
RPM_HASH = "c24636bdc54e8f1d2a8c08977aa8073d54870d604b6d46686ff2039f92c37cfdeaf56967e671e0edee7d88a797444cf2fd6873d8047c27fa757a7e917b1cccac"

RPROVIDES:${PN} += "python3-ldns"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libldns.so.3 \
libldns3 \
libpython3.11.so.1.0 \
python-abi"

inherit rpm
