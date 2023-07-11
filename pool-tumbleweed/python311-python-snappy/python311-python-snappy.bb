SUMMARY = "Python library for the snappy compression library"
DESCRIPTION = "Python library for the snappy compression library from Google."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python311-python-snappy-0.6.1-1.5.aarch64.rpm"
RPM_HASH = "067fdfa7e0795c4912e113c32109de570ef85c9c9f4f4554d184ecda170115dd8863694afa0f020a8c6b5f54fd447a51348d3c83b9cac1f0761a832c87a95b07"

RPROVIDES:${PN} += "python3-python-snappy \
python3.11dist-python-snappy \
python311-python-snappy \
python3dist-python-snappy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsnappy.so.1 \
python-abi"

inherit rpm
