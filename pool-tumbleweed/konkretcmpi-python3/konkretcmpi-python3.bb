SUMMARY = "Python bindings for konkretcmpi"
DESCRIPTION = "This package contains python binding for konkretcmpi."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "konkretcmpi-python3-0.9.2-14.4.aarch64.rpm"
RPM_HASH = "76097edde8eb184b6abe39568415da43e894fb40c96fd17c98a5684e656f022a6553ec1c43fc2c1d898640eaf50aeeb0199d33f9dbd2c8f4f7d1136a7ce24309"

RPROVIDES:${PN} += "konkretcmpi-python3"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libkonkretmof.so.0 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
python-abi \
python3"

inherit rpm
