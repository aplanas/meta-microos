SUMMARY = "Python bindings for konkretcmpi"
DESCRIPTION = "This package contains python binding for konkretcmpi."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "konkretcmpi-python3-0.9.2-14.3.aarch64.rpm"
RPM_HASH = "1780383601c1778b1ade9716ab4aaac8f16b7579cfbff495adf279595f39e6b90cf3aa456c0fcfd17460a68f3955d1b635bad6aafd8c9f0ab806c7b32e53e9b9"

RPROVIDES:${PN} += "konkretcmpi-python3"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libkonkretmof.so.0 \
libpython3.10.so.1.0 \
libstdc++.so.6 \
python-abi \
python3"

inherit rpm
