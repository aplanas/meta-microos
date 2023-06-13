SUMMARY = "Python bindings for konkretcmpi"
DESCRIPTION = "This package contains python binding for konkretcmpi."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "konkretcmpi-python3-0.9.2-14.3.aarch64.rpm"
RPM_HASH = "1780383601c1778b1ade9716ab4aaac8f16b7579cfbff495adf279595f39e6b90cf3aa456c0fcfd17460a68f3955d1b635bad6aafd8c9f0ab806c7b32e53e9b9"

RPROVIDES:${PN} += "konkretcmpi-python3 \
konkretcmpi-python3(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libkonkretmof.so.0()(64bit) \
libpython3.10.so.1.0()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python3"

inherit rpm
