SUMMARY = "JavaScript in Python"
DESCRIPTION = "DukPy is a JavaScript runtime environment for Python using the duktape \
embeddable JavaScript engine. With dukpy, you can run JavaScript in \
Python."
LICENSE = "MIT"

PV = "0.3"

RPM_NAME = "python311-dukpy-kovidgoyal-0.3-3.11.aarch64.rpm"
RPM_HASH = "ad3b4680cef29f50fcaa93d924678569160010e3a2aa78983550f38c56b7d87bdc8ba4296ec264ae84256d41f6668e2d77ca4d8953a8b2e3435ee15f09383b1d"

RPROVIDES:${PN} += "python3.11dist-dukpy \
python311-dukpy-kovidgoyal \
python3dist-dukpy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
