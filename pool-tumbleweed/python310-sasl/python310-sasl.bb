SUMMARY = "SASL for Python"
DESCRIPTION = "Cyrus-SASL bindings for Python."
LICENSE = "Apache-2.0"

PV = "0.3.1"

RPM_NAME = "python310-sasl-0.3.1-1.4.aarch64.rpm"
RPM_HASH = "9e6bd7d829e3a4968923d9e47f5113b9411a9df7bed22643093591e87c9afebe09b1ee0ad51ad05b316b29959922eccd77eda9be248206183607823fe8636907"

RPROVIDES:${PN} += "python3-sasl \
python3.10dist-sasl \
python310-sasl \
python3dist-sasl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsasl2.so.3 \
libstdc++.so.6 \
python-abi \
python310-six"

inherit rpm
