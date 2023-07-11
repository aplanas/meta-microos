SUMMARY = "Python bindings for liborcus"
DESCRIPTION = "Python 3 bindings for liborcus."
LICENSE = "MPL-2.0"

PV = "0.17.2"

RPM_NAME = "python3-liborcus-0.17.2-3.5.aarch64.rpm"
RPM_HASH = "2cbb502edee99127d101e805fbd304041449da63abfbd8569b8c1559f0e0fb804ffb6439bcfc9e18bb487ca80c1a0d72618e84e8f355ea25d551001c2dd478d2"

RPROVIDES:${PN} += "liborcus-python3 \
python3-liborcus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libixion-0.17.so.0 \
liborcus-0.17.so.0 \
liborcus-parser-0.17.so.0 \
liborcus-spreadsheet-model-0.17.so.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
