SUMMARY = "SASL for Python"
DESCRIPTION = "Cyrus-SASL bindings for Python."
LICENSE = "Apache-2.0"

PV = "0.3.1"

RPM_NAME = "python311-sasl-0.3.1-1.6.aarch64.rpm"
RPM_HASH = "f906ee150c15425850cc1e8a6cfebeb37cfb6d9de7a4e8f01cd39741721df121c21a2d03f96820bb0798c111147ed6afb83d5dd61f8cee1f2fd4d2efc1692971"

RPROVIDES:${PN} += "python3-sasl \
python3.11dist-sasl \
python311-sasl \
python3dist-sasl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsasl2.so.3 \
libstdc++.so.6 \
python-abi \
python311-six"

inherit rpm
